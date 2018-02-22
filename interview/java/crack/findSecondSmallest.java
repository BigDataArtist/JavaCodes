package interview.java.crack;

public class findSecondSmallest {

	static void print2Smallest(int arr[]) {
		int first, second, arr_size = arr.length;

		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.println(" Invalid Input ");
			return;
		}

		System.out.println(" Integer max value " + Integer.MAX_VALUE);

		first = second = Integer.MAX_VALUE;

		System.out.println(" first is " + first + " second is " + second);
		for (int i = 0; i < arr_size; i++) {
			/*
			 * If current element is smaller than first then update both first
			 * and second
			 */

			System.out.println(" arrays arr[i] " + arr[i]);
			if (arr[i] < first) {
				second = first;
				System.out.println(" secomd will be " + second);
				first = arr[i];
			}

			/*
			 * If arr[i] is in between first and second then update second
			 */

			else if (arr[i] < second && arr[i] != first)
				second = arr[i];
			System.out.println(" secind here is " + second + " arrays arr[i] is " + arr[i] + " first here is " + first);
		}
		if (second == Integer.MAX_VALUE)
			System.out.println("There is no second" + "smallest element");
		else
			System.out.println("The smallest element is " + first + " and second Smallest" + " element is " + second);
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		print2Smallest(arr);
	}

}

class ProgramJava {

	public static void main(String args[]) {

		int[] arrs = { 5, 6, 4, 3, 2, 1 };

		int first;
		int second;

		first = second = Integer.MAX_VALUE;

		for (int i = 0; i < arrs.length; i++) {

			System.out.println("arrs[i] " + arrs[i]);
			System.out.println("first is " + first);
			if (arrs[i] < first) {
				second = first;
				System.out.println(" second is " + second);
				first = arrs[i];

			}

			if (arrs[i] < second && arrs[i] != first) {
				second = arrs[i];
			}
			
			
		}

		System.out.println(" first is " + first + " second " + second);

	}
}
