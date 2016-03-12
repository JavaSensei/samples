package ru.kpfu.itis.group11506.tictactoe;

import java.util.Scanner;

public class Human extends Player {
    

    public Human(String name){
        super(name);
    }

    public void move(Board board,  char symbol){
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter y x  [1,2,3]");
        x = scanner.nextInt();
        y = scanner.nextInt();

            while (x < 1 || x > 3 || y < 1 || y > 3 || board.getValue(x-1,y-1) != ' '){
            System.out.println("Enter y & x ");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        board.setValue(x-1,y-1,symbol);
    }
}
