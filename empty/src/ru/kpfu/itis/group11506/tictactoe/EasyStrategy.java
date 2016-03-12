package ru.kpfu.itis.group11506.tictactoe;

import java.util.Random;

public class EasyStrategy  implements GameStrategy{
    Random rnd = new Random();

    public EasyStrategy() {

    }

    public void move(Board board,  char symbol){
        int x,y;
        x = rnd.nextInt(3);
        y = rnd.nextInt(3);

        while (board.getValue(x,y) != ' '){
            x = rnd.nextInt(3);
            y = rnd.nextInt(3);
        }

        board.setValue(x,y,symbol);

    }
}
