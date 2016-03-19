package ru.kpfu.itis.exceptions;

import java.util.Scanner;

public class UserFactory {

	public static int MAX_TRY = 10;

	public static void main(String[] args) {
		try {
			createUser();
		} catch(UserInputException e) {
			System.err.println("Ошибка пользовательского ввода: "
					+ e.getMessage());
			e.printStackTrace();
		}
	}

	public static User createUser()
			throws UserInputException{
		// TODO: Creating user
		Scanner scanner = new Scanner(System.in);
		boolean hasInputNumber = false;
		String inputNumber = null;
		for (int tryIndex = 0; tryIndex<MAX_TRY && !hasInputNumber;
				tryIndex++) {
			try {
				inputNumber = getPhoneNumber(scanner);
				hasInputNumber = true;
			} catch(UserInputException exception) {
				exception.printStackTrace();
				System.err.println("Неправильный ввод данных: "
						+ exception.getMessage());
			}
		}
		if (inputNumber == null) {
			throw new UserInputException("Превышено количество "
					+ "попыток набора номера");
		}
		return new User();
	}

	private static String getPhoneNumber(Scanner scanner)
			throws UserInputException {
		String userInput = scanner.next();

		int inputSize = userInput.length();
		if (inputSize != 11 && inputSize != 7) {
			throw new UserInputException("Неправильная длина телефонного номера");
		}
		return userInput;
	}

}
