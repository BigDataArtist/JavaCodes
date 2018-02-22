package interview.java.crack;

import java.util.Arrays;

public class NegPosNums {

	public static int[] ArrangeValues(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			System.out.println(" the value of i at the top " + i);
			int temp = arr[i];

			System.out.println(" temp is " + temp);

			while (i > 0 && arr[i - 1] > temp) {

				System.out.println(" arr[i]  before " + arr[i]);

				System.out.println(" arr[i-1] " + arr[i - 1]);

				arr[i] = arr[i - 1];

				System.out.println(" arr[i]  after " + arr[i]);

				System.out.println(" the value of i before  " + i);

				i = i - 1;

				System.out.println(" the value of i after " + i);

			}

			System.out.println(" so i here is " + i);

			arr[i] = temp;

			System.out.println(" the value of arr[i] " + arr[i]);

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		return arr;
	}

	public static void main(String args[]) {

		int[] arr = { 2, 1, 8, 4, 5 };

		ArrangeValues(arr);

	}
}

class sort {

	public static void sortArray(int[] a) {

		for (int i = 1; i < a.length; i++) {

			System.out.println(" i is " + i);

			int temp = a[i];

			System.out.println(" the temp is " + temp);

			while (i > 0 && a[i - 1] > temp) {

				System.out.println("b a[i]  " + a[i]);
				System.out.println(" B  a[i-1]  " + a[i - 1]);
				a[i] = a[i - 1];

				System.out.println(" A  " + a[i]);

				i = i - 1;

				System.out.println("i is " + i);
			}
			a[i] = temp;

			System.out.println(" a[i] from temp  " + a[i]);

			for (int j = 0; j < a.length; j++) {

				System.out.print(a[j] + " ");
			}
		}

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}

	public static void main(String args[]) {

		int[] arrs = { 1, 5, 3, 8, 4 };

		// System.out.println("arrays is " + Arrays.toString(arrs));
		sortArray(arrs);

	}
}
