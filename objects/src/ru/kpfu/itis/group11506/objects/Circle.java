package ru.kpfu.itis.group11506.objects;

public class Circle extends Figure {
	
	private int radius;
	
	public Circle(int centerX, int centerY, int initRadius) {
		super(centerX, centerY);
		System.out.println("In circle");
		radius = initRadius;
	}
	 
	public void draw() {
		System.out.println("Drawing circle in " + getxCenter() + 
				" " + getyCenter() );
		someMethod();
	}

	public int getRadius() {
		return radius;
	}
	
}
