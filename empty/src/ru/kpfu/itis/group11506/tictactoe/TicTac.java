package ru.kpfu.itis.group11506.tictactoe;

public class TicTac {

    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Human("Player1");
        Player player2 = new Human("Player2");

        //if args == null -> Human vs Human
        //if args == "-mode easy" -> Human vs Easy Computer
        //if args == "-mode hard" -> Human vs Hard Computer
        if (args.length != 0 && args[0].equals("-mode")){
            if (args[1].equals("easy")){
                player1 = new Computer(new EasyStrategy(), "Easy pc");
            } else if (args[1].equals("hard")){
                player1 = new Computer(new HardStrategy(board), "Hard pc");
            }
        }

        Game game = new Game(player1, player2, board);

        game.startGame();
    }
}