package ru.kpfu.itis.group11506.generics;

public class Box<T> {

	private T something;

	public Box(T something) {
		this.something = something;
	}

	public T getSomething() {
		return something;
	}

}
