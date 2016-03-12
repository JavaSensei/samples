package ru.kpfu.itis.group11506.interfaces;

public interface SomeInterface extends OtherInterface{

	static final String SOME_CONST = "hello";

	void someMethod();

	void otherMethod(String someParam);

	static String getSomething() {
		return "something";
	}

	default void someDefaultMethod() {
		System.out.println("hello");
	}

}
