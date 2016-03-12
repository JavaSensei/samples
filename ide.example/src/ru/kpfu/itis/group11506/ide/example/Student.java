package ru.kpfu.itis.group11506.ide.example;

public class Student {

	private final String name;

	private final int age;

	private final int group;

	public Student(String name, int age, int group) {
		this.name = name;
		this.age = age;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getGroup() {
		return group;
	}

}
