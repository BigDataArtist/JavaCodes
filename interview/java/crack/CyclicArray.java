package interview.java.crack;

import java.awt.SystemColor;

class CyclicArray {

	static int SUM = 0;
	static int max = 0;

	public static void rotate(int[] arrs) {
		System.out.println("capture the value to rotate");

		int val = arrs[arrs.length - 1];

		System.out.println("The value to rotate is " + val);

		for (int i = arrs.length - 1; i > 0; i--) {

			arrs[i] = arrs[i - 1];
		}

		arrs[0] = val;

		for (int i = 0; i < arrs.length; i++) {
			System.out.println(" arrs is  " + arrs[i]);

			SUM = SUM + arrs[i] * i;
		}

		if (SUM > max) {
			max = SUM;
		}

		System.out.println("sum is " + SUM);
	}

	public static void main(String args[]) {

		int[] arrs = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < arrs.length; i++) {
			rotate(arrs);
		}

	}

}

class ReviseCyclic {

	//static int SUM = 0;
	static int max = 0;

	public static void rotate(int[] arrs) {
		int SUM = 0 ;
		//int max=0;
		System.out.println("capture the value to rotate");

		int val = arrs[arrs.length - 1];

		System.out.println("The value to rotate is " + val);

		for (int i = arrs.length - 1; i > 0; i--) {

			arrs[i] = arrs[i - 1];
		}

		arrs[0] = val;

		for (int i = 0; i < arrs.length; i++) {
			System.out.println(" arrs is  " + arrs[i]);
			System.out.println("i is" + i);
			
			System.out.println(" multiplication is  "+ arrs[i]*i);
			SUM = SUM + arrs[i] * i;
			
			System.out.println(" SUM is "+ SUM);
		}

		if (SUM > max) {
			max = SUM;
		}

		System.out.println(" Max sum is " + max);
		System.out.println("sum is " + SUM);
	}

	public static void main(String args[]) {

		int[] arrs = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < arrs.length; i++) {
			rotate(arrs);
		}

	}

}