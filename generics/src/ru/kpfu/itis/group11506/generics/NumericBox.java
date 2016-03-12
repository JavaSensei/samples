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
	}

	public static boolean doCompareBlaBla(NumericBox<Number> a) {
		return false;
	}

}
