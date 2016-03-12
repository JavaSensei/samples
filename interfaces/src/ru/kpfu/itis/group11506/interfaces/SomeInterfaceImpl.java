package ru.kpfu.itis.group11506.interfaces;

public class SomeInterfaceImpl implements SomeInterface,
AnotherInterface {

	@Override
	public void someMethod() {
		System.out.println("Do some method");
	}

	@Override
	public void otherMethod(String someParam) {
		System.out.println("Do other method. Params: " + someParam);
	}

	@Override
	public void doAnything() {
		System.out.println("Do anything");
	}

	@Override
	public void someAnotherMethod() {
		System.out.println("Some another method");
	}

}
