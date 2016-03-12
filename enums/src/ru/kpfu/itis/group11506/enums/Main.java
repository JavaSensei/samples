package ru.kpfu.itis.group11506.enums;

public class Main {

	public static void main(String[] args) {
		//		int[] elements = { 1, 2, 3, 4, 5 };
		//		int max = getMaxValue(elements);
		//		System.out.println(max);
		"subsctring".substring(3);
	}

	private static int getMaxValue(int[] value) {
		int max = value[0];
		for (int index = 1; index < value.length; index++) {
			if (max < value[index]) {
				max = value[index];
			}
		}
		return max;
	}

}
