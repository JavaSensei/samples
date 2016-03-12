package ru.kpfu.itis.group11506.objects.init;

public class ChessBoard
    extends Board {

	protected String b;
	
	{
		b = "Adel";
		System.out.println(b);
	}
	
	public ChessBoard() {
	}
	
	public static void main(String[] args) {
		new ChessBoard();
	}
	
}
