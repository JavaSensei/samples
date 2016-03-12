package ru.kpfu.itis.group11506.objects;

public class Figure extends Object {

	private double xCenter;

	private double yCenter;
	
	public Figure(int initXCenter, int initYCenter) {
		System.out.println("Into figure");
		xCenter = initXCenter;
		yCenter = initYCenter;
	}

	public double getxCenter() {
		return xCenter;
	}

	public double getyCenter() {
		return yCenter;
	}

	public void draw() {
		System.out.println("Drawing figure...");
	}

	protected void someMethod() {
		System.out.println("In some method");
	}

}
