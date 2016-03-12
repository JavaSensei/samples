package ru.kpfu.itis.group11506.tictactoe;

public class Game {
    public static final char X = 'X';
    public static final char O = '0';
    public static final char EMPTY = ' ';

    private Player player1;
    private Player player2;
    private Board board;
    private Player activePlayer;
    private char symbol = X;

    public Game(Player player1, Player player2, Board board){
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        this.activePlayer = player1;
    }

    public void startGame(){
        while(!board.isGameOver(symbol)) {
            board.drawBoard();
            System.out.println();
            move();
        }

        board.drawBoard();

        //Check game result
        if (board.checkBoardLine(symbol)){
            System.out.println(activePlayer.getName() + " won!");
        } else {
            System.out.println("It's draw");
        }
    }

    public void move(){
        activePlayer.move(board, symbol);
        if (board.isGameOver(symbol)) return;
        //Change active player & active symbol
        activePlayer = activePlayer == player1 ? player2 : player1;
        symbol = symbol == X ? O : X;
    }
}
