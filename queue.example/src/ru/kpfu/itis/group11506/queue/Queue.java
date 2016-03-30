package ru.kpfu.itis.group11506.queue;

import java.util.NoSuchElementException;

public interface Queue<T> extends Iterable<T> {

	void push() throws QueuOutOfBoundException;

	T poll() throws NoSuchElementException;

	T peek() throws NoSuchElementException;

	int size();

}
