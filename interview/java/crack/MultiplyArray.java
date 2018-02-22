package interview.java.crack;

public class MultiplyArray {

	static int max = 0;

	/*public static void RotateArray(int[] arr, int d) {

		for (int i = 0; i < d; i++) {
			RotateOnce(arr);
		}
	}*/

	public static void RotateOnce(int[] arr) {

		int sum = 0;
		int temp = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
			
			// System.out.println(" the value of array is"+arr[i]);
			// System.out.println(" the value of array is"+arr[i+1]);
			
		}
		arr[arr.length - 1] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(" array is " + arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			
			// System.out.println("arr[i] is " + arr[i]);
			// System.out.println("i is "+i);
			
			sum = sum + arr[i] * i;
		}
		if (sum > max) {
			System.out.println(" This is for debugging " + max);
			max = sum;
		}
		System.out.println(" sum is " + sum);

		System.out.println(" The final value of max is " + max);

		// System.out.println(" The max is " + max);
	}

	public static void main(String args[]) {

		int arr[] = { 5, 3, 2, 1, 4, 7};
		int sum = 0;

		for( int i = 0 ; i < arr.length;i++){
		RotateOnce(arr);
		}
	}

}
