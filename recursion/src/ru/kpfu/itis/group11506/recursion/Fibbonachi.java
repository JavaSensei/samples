package ru.kpfu.itis.group11506.recursion;

public class Fibbonachi {

	public int calculateByRecursion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return calculateByRecursion(n - 1) + calculateByRecursion(n - 2);
	}

	public int calculateByCicle(int n) {
		int sum = 1;
		int previousSum = 1;
		for (int i = 2; i < n; i++) {
			previousSum = sum;
			sum += previousSum;
		}
		return sum;
	}

	public static void main(String[] args) {
		Fibbonachi fibCalculator = new Fibbonachi();
		System.out.println(fibCalculator.calculateByCicle(6));
	}

}
