package ru.kpfu.itis.group11506.generics;

public class Pair<T, E> {

	private T first;
	private E second;

	public Pair(T first, E second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public E getSecond() {
		return second;
	}

}
