package ru.kpfu.itis.exceptions;

import java.util.Scanner;

public class ExceptionsExample {

	public static void main(String[] args) {
		//		divisionByZero();
		System.out.println("Starting...");
		handleUserInput();

		System.out.println("End");
	}



	private static void handleUserInput() {
		Scanner scanner = new Scanner(System.in);


		String a = scanner.next();
		try {
			int someNumber = Integer.parseInt(a);
			int someOtherNumber = 10;
			System.out.println(someOtherNumber/someNumber);
		} catch (ArithmeticException e) {
			System.err.println("Division by zero! " + e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			System.err.println("Incorrect number format "+ e.getMessage());
			e.printStackTrace();
		}

	}

	private static void divisionByZero() {
		try {
			System.out.println(1/0);
			int a = 1;
			System.out.println(a);
		} catch(ArithmeticException e) {
			System.out.println("Division by zero!");
		}
	}

}
