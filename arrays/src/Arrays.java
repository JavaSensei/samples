public class Arrays {

	public static void main(String[] args) {
//		int[] a = new int[100];
		// for (int index = 0; index < a.length; index++) {
		// a[index] = index + 1;
		// System.out.println(a[index]);
		// }

		// double[] b = new double[5];
		// byte[] c = new byte[5];
		//
		// int n = 1, a1[] = new int[5];
		//
		// int[] a2 = { 1, 2, 3, 4 };
		//
		// char[] c1 = {'a', 'b', 'c', 'd'};
		// System.out.println(c1.length);
		// System.out.println(c1[0]);

		// int[] empty = new int[0];
		// System.out.println(empty[0]);

		int n = 5;
		
		int m = 6;
		int[][] a2 = { {1,2,3}, {12, 3, 5, 5}, {2, 4, 5, 6}};
		
		for (int[] row : a2) {
			for(int col : row) {
				System.out.print(col);
				System.out.print(" ");
			}
			System.out.println();
		} 
		
		
		int[] a = new int[]{1, 2, 3, 4, 5};
//		for (int element: a) {
//			System.out.println(element);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		printArray(a2);
		
	}
	
	private static void printArray(int[][] array) {
		if (array == null) {
			System.out.println("Чуваааак, ты передал null");
		} else {
			for (int row =0 ; row<array.length; row++) {
				if (array[row] == null) {
					System.out.print("null");
				} else {
					for (int col=0; col<array[row].length; col++) {
						System.out.print(array[row][col]);
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
