package ru.kpfu.itis.group11506.generics;

public class Main {

	public static void main(String[] args) {
		//		beforeGenerics();

	}

	private static void beforeGenerics() {
		Box boxInt = new Box(1);
		Box boxString = new Box("Batyr");

		Object unknown = boxInt.getSomething();
		int a = (int)unknown;
		System.out.println(a);

		// Error!
		Object unknown2 = boxString.getSomething();
		int a2 = (int)unknown2;
		System.out.println(a2);
	}


	private static void runGenerics() {
		Box<String> boxStr = new Box<>("Batyr");
		String value = boxStr.getSomething();

		Box<Integer> boxInt = new Box<>(1);
		Box<Boolean> boxBool = new Box<>(true);
	}

	private static void multiGeneris() {
		Pair<String, Integer> pair = new Pair<>("Azat", 100);
		String first = pair.getFirst();
		int second = pair.getSecond();

		Pair<Pair<String, String>, Pair<Integer, String>> bigPair =
				new Pair<>(new Pair<>("", ""),
						new Pair<>(1, "1"));
	}

	private static void questions() {
		Box<Object> a = new Box<>(1);
		Box b = new Box(1);
	}

	private static void someAddFeatures() {
		Box a = new Box(1);
		Box b = new Box("Egor");

		a = b;

		// Error!
		Box<Integer> intBox = new Box(1);
		Box<String> strBox = new Box("Egor");
		//		intBox = strBox;
	}




































}
