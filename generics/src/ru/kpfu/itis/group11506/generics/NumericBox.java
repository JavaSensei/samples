package ru.kpfu.itis.group11506.generics;

public class NumericBox<T extends Number /*& Comparable<T>*/> {

	private T number;

	public NumericBox(T number) {
		this.number = number;
	}

	public T getNumber() {
		return number;
	}

	public static void main(String[] args) {
		NumericBox<Integer> intBox = new NumericBox<>(1);
		NumericBox<Double> doubleBox = new NumericBox<>(1.0);

		//		NumericBox<String> strBox = new NumericBox<>("sdsdf");
		doCompareBlaBla(intBox);
		doCompareBlaBla(new NumericBox<Number>(1));
		Integer i = 1;
		doCompare2(i);
	}

	public static boolean doCompareBlaBla(NumericBox<? extends Number> a) {

		return false;
	}

	public static boolean doCompare2(Number a) {
		return false;
	}















}
