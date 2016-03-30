package ru.kpfu.itis.group11506.queue;

public class QueuOutOfBoundException extends Exception {

	public QueuOutOfBoundException(String message) {
		super(message);
	}

	public QueuOutOfBoundException(Throwable cause) {
		super(cause);
	}

	public QueuOutOfBoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
