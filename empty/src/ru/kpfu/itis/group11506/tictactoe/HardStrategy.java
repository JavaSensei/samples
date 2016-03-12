package ru.kpfu.itis.group11506.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class HardStrategy  implements GameStrategy {
    List<Point> availablePoints;
    Point computersMove;
    Board board;

    HardStrategy(Board board){
        this.board = board;
    }

    public List<Point> getAvailableStates() {
    	availablePoints = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (board.getValue(i,j) == Game.EMPTY) {
                    availablePoints.add(new Point(i, j));
                }
            }
        }
        return availablePoints;
    }

    public void placeAMove(Point point, char symbol) {
        board.setValue(point.x,point.y,symbol);
    }

    public void move(Board board, char symbol) {
        minimax(0,1,symbol);
        board.setValue(computersMove.x, computersMove.y,symbol);
    }

    //minimax algorithm with alpha beta pruning
    /**
     * 
     * 
     * @param depth
     * @param turn 
     * @param symbol
     * @return
     */
    public int minimax(int depth, int turn, char symbol) {
        char eSymbol = (symbol == Game.X) ? Game.O : Game.X;
        if (board.checkBoardLine(symbol)) return +1;
        if (board.checkBoardLine(eSymbol)) return -1;

        List<Point> pointsAvailable = getAvailableStates();
        if (pointsAvailable.isEmpty()) return 0;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < pointsAvailable.size(); ++i) {
            Point point = pointsAvailable.get(i);
            if (turn == 1) {
                placeAMove(point, symbol);
                int currentScore = minimax(depth + 1, 2, symbol);
                max = Math.max(currentScore, max);

                if(currentScore >= 0 && depth == 0){
                        computersMove = point;
                }

                if(currentScore == 1){
                    board.setValue(point.x , point.y, Game.EMPTY);
                    break;
                }

                if(i == pointsAvailable.size()-1 && max < 0 && depth == 0){
                        computersMove = point;
                }

            } else if (turn == 2) {
                placeAMove(point, eSymbol);
                int currentScore = minimax(depth + 1, 1,symbol);
                min = Math.min(currentScore, min);
                if(min == -1){
                    board.setValue(point.x,point.y, Game.EMPTY);
                    break;
                }
            }
            board.setValue(point.x,point.y, Game.EMPTY);
        }
        return turn == 1 ? max : min;
    }
}