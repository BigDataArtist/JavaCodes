package interview.java.crack;

public class InsertNuminArray {

	public static int[] insertArray(int[] a, int pos, int num) {
		// Making a new array
		int[] result = new int[a.length + 1];
		for (int i = 0; i < pos; i++) {
			System.out.println(" i is " + i);
			result[i] = a[i];
			System.out.println(result[i]);
		}
		result[pos] = num;
		System.out.println(result[pos]);
		for (int i = pos + 1; i < result.length; i++) {
			result[i] = a[i - 1]; // This is putting the value from original
									// array which is 3
			System.out.println(" Later" + result[i]);
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		return result;
	}

	public static void main(String args[]) {
		insertArray(new int[] { 1, 2, 3, 4, 5 }, 2, 9);

	}

}
