package ru.kpfu.itis.group11506.enums;

public enum Color {

	RED("Красный"), GREEN("Зеленый"), BLUE("Синий");

	private String description;

	private Color(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
