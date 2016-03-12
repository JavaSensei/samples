package ru.kpfu.itis.group11506.interfaces;

public class Main {

	public static void main(String[] args) {
		OtherInterface someInterface = new SomeInterfaceImpl();
		AnotherInterface someInterface2 = new SomeInterfaceImpl();
		SomeInterface someInterface3 = new SomeInterfaceImpl();

		AnotherInterface castedType = (AnotherInterface)someInterface;
		//		doSomeOperation(someInterface);
	}

	//	private static void doSomeOperation(SomeInterface someInterface) {
	//		someInterface.someMethod();
	//	}

}
