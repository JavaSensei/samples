public class Test {

	public static void main(String[] args) {
		int a = 4;
		int b = ++a;

		System.out.println(a);
		System.out.println(b);

		float res = (float) (10. + 20.);

		int d = 10;
		boolean canMove = false;
		switch (d / 8) {
		case 1:
			canMove = true;
		case 2:
			System.out.println("One-Two");
		case 3:
			System.out.println("Three");
		default:
			System.out.println(canMove ? "Can move" : "Can not move");
		}

		double[] sourceArr = new double[] { 1, 2, 3, 4, 5 };
		int index = 0;
		while (index < (sourceArr.length / 2)) {
			double buff = sourceArr[index];
			sourceArr[index] = sourceArr[sourceArr.length - index - 1];
			sourceArr[sourceArr.length - index - 1] = buff;
			index++;
		}
		for (double element : sourceArr) {
			System.out.print(element + "  ");
		}

		double[] arr = new double[] { 1, 2.5, 3, 4 };
		double sum = 0;
		for (double element : arr) {
			sum += element;
		}
		double average = sum/arr.length;

	}

}
