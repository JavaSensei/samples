package ru.kpfu.itis.group11506.objects;

public class Student {

	private int age;

	private double height;

	private int group;

	private String name;

	public void sleep() {
		System.out.println("Zzzzzzzz");
	}

	public int getSomeNumber(int max) {
		int someNumber = (int) (max * Math.random());
		return someNumber;
	}

	public void printName() {
		System.out.println(name);
	}
	
	public void setName(String otherName) {
		name = otherName;
	}
	
	public String getName() {
		return name;
	}

}
