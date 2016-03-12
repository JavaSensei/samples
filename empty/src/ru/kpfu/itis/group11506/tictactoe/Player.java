package ru.kpfu.itis.group11506.tictactoe;

public abstract class Player {
    private String name;

    public Player(){

    }

    public Player(String name){
        this.name = name;
    }

    public abstract void move(Board board, char symbol);
    public String getName() {
        return name;
    }

}
