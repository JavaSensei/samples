package ru.kpfu.itis.group11506.objects;

public class Main {

	public static void main(String[] args) {
		ComplexNumber complexNumber = new ComplexNumber(1, 1);
		ComplexNumber complexNumber1 = new ComplexNumber(1);

		System.out.println("First complex number:" + complexNumber.getNumerAsString());
		System.out.println("Second complex number:" + complexNumber1.getNumerAsString());
		
		System.out.println("After plus");
		complexNumber.plus(complexNumber1);
		System.out.println("First complex number:" + complexNumber.getNumerAsString());
	}

}