package interview.java.crack;

class RotateArrays {
	/* Function to left rotate arr[] of size n by d */
	static void leftRotate(int arr[], int d, int n) {
		int i;
		for (i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
	}

	static void leftRotatebyOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		/*
		 * System.out.println(" value of n " + n); System.out.println(
		 * " array is " + arr[0]); System.out.println(" temp is  " + temp);
		 */
		for (i = 0; i < n - 1; i++) {
			System.out.println(" Array value before " + arr[i]);
			System.out.println(" Array arr[i +1] value" + arr[i + 1]);
			arr[i] = arr[i + 1];
			System.out.println(" Array value after " + arr[i]);
		}

		System.out.println("i is " + i);
		System.out.println("i is " + arr[i]);
		arr[i] = temp;

		System.out.println(arr[i]);
	}

	/* utility function to print an array */
	static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		leftRotate(arr, 2, 7);
		printArray(arr, 7);
	}
}
