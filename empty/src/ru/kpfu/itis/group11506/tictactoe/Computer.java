package ru.kpfu.itis.group11506.tictactoe;

public class Computer extends Player  {
    private String name;

    public String getName() {
        return name;
    }

    private GameStrategy gameStrategy;

    //Choose game strategy
    public Computer(GameStrategy gameStrategy, String name){
        this.gameStrategy = gameStrategy;
        this.name = name;
    }

    public void move(Board board, char symbol){
        gameStrategy.move(board, symbol);
    }
}