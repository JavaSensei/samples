package ru.kpfu.itis.group11506.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    public char[][] board = new char[3][3];
    List<Point> availablePoints;

    public Board(){
        fillBoard();
    }

    public void fillBoard(){
        for (int i = 0; i < board.length; i++) {
             for (int j = 0; j < board[i].length; j++){
                 board[i][j] = Game.EMPTY;
             }
        }
    }

    public void drawBoard(){
        for (char[] e :board){
            System.out.println(Arrays.toString(e));
        }
    }
    
    public void setValue(int x, int y, char value){
        board[x][y] = value;
    }

    public char getValue(int x, int y){
        return board[x][y];
    }

    public boolean checkBoardLine(char symbol){
        //Check diagonals
        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == symbol) ||
                (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == symbol)) {
            return true;
        }

        //check rows and columns
        for (int i = 0; i< 3; i++){
            if ((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == symbol)||
                    (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == symbol) ){
                return true;
            }
        }
        return false;
    }

    public boolean isGameOver(char symbol) {
        //Game is over if someone has won, or board is full (draw)
        return (checkBoardLine(symbol) || getAvailableStates().isEmpty());
    }


    public List<Point> getAvailableStates() {
        //List of empty points
        availablePoints = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (board[i][j] == Game.EMPTY) {
                    availablePoints.add(new Point(i, j));
                }
            }
        }
        return availablePoints;
    }
}
