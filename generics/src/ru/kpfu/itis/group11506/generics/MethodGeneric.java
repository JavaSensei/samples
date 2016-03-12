package ru.kpfu.itis.group11506.generics;

public class MethodGeneric {

	public <T> Box<T> getBox(T value) {
		return new Box<>(value);
	}

	public static void main(String[] args) {
		MethodGeneric methodGenerics = new MethodGeneric();
		Box<String> strBox = methodGenerics.getBox("String");
		Box<Integer>intBox = methodGenerics.getBox(1);
	}

}
