package interview.java.crack;

public class countNumOccr {

	// this method will count the occurrence

	static int count(int[] arr, int x, int n) {

		int i;

		int j;

		i = firstCall(arr, 0, n - 1, x, n);

		System.out.println(" i is " + i);

		// if x is not present in the array
		if (i == -1) {
			return i;
		}

		j = lastcall(arr, i, n - 1, x, n);

		System.out.println(" j is " + j);

		return j - i + 1;

	}

	static int firstCall(int[] arr, int low, int high, int x, int n) {

		System.out.println(" high is " + high + " low is" + low);

		if (high >= low) {

			int mid = (low + high) / 2;
			System.out.println(" mid is " + mid);
			// if mid == 0 means there is no element in the array, x <arr[mid-1]
			// ->fails the sorted array condition of all ascending
		
			if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
				return mid; // this will give the number x which is == mid
			} else if (x > arr[mid]) {

				return firstCall(arr, (mid + 1), high, x, n);
			} else {
				return firstCall(arr, low, (mid - 1), x, n);
			}

		}
		return -1;

	}

	static int lastcall(int[] arr, int low, int high, int x, int n) {

		System.out.println(" high is " + high + " low is" + low);
		if (high >= low) {

			int mid = (low + high) / 2;

			System.out.println(" mid is " + mid);
			// the array should end at n -1

			
			if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x) {
				return mid;
			} else if (x < arr[mid]) { // as there is new mid so we have to
										// still check that if our x is still
										// not smaller then the new mid
				return lastcall(arr, low, (mid - 1), x, n);
			} else {
				return lastcall(arr, (mid + 1), high, x, n);
			}

		}
		return -1;

	}

	public static void main(String args[]) {

		int[] arr = { 1,1, 2, 2, 3, 3, 3, 3 };

		int n = arr.length;

		int x = 3; // no to find the occurrence

		int c = count(arr, x, n);

		System.out.println(x + " has count is " + c);

	}
}

class countOccur {

	public static int count(int[] arrs, int x, int n) {

		int i;

		int j;

		i = firstCall(arrs, 0, n - 1, x, n);

		j = lastCall(arrs, i, n - 1, x, n);

		return j - i + 1;

	}

	public static int firstCall(int[] arrs, int low, int high, int x, int n) {

		System.out.println("high is " + high + " low is " + low);

		if (high >= low) {

			System.out.println(" high is " + high);

			System.out.println(" low is " + low);

			int mid = (high + low) / 2;

			System.out.println(" middle is " + mid);

			if ((mid == 0 || x > arrs[mid - 1]) && x == arrs[mid]) {
				return mid;
			}

			else if (x <= arrs[mid]) {

				return firstCall(arrs, low, (mid - 1), x, n);

			}

			else {
				return firstCall(arrs, (mid + 1), high, x, n);
			}

		}

		return -1;

	}

	public static int lastCall(int[] arrs, int low, int high, int x, int n) {

		System.out.println(" the high is  " + high + "low is " + low);

		if (high >= low) {

			int mid = (high + low) / 2;

			System.out.println("middle is " + mid);
			System.out.println(n - 1);

			System.out.println("arrs[mid]" + arrs[mid] + " arrs[mid+1]" + arrs[mid + 1]);
			if ((mid == n - 1 || x < arrs[mid + 1]) && x == arrs[mid]) {
				return mid;
			}

			else if (x < arrs[mid]) {
				return lastCall(arrs, low, (mid - 1), x, n);
			}

			else {
				return lastCall(arrs, (mid + 1), high, x, n);
			}

		}

		return -1;
	}

	public static void main(String args[]) {

		int arrs[] = { 1, 2, 2, 3, 3, 3, 3, 3, 4 };

		int x = 3;

		int n = arrs.length;

		int c = count(arrs, x, n);

		System.out.println(x + "The count is " + c);

	}
}

class Main {

	static int count(int arr[], int x, int n) {

		int i;

		int j;

		/* get the index of first occurrence of x */
		i = first(arr, 0, n - 1, x, n);

		/* If x doesn't exist in arr[] then return -1 */
		if (i == -1)
			return i;

		/*
		 * Else get the index of last occurrence of x. Note that we are only
		 * looking in the subarray after first occurrence
		 */
		j = last(arr, i, n - 1, x, n);

		/* return count */
		return j - i + 1;
	}

	/*
	 * if x is present in arr[] then returns the index of FIRST occurrence of x
	 * in arr[0..n-1], otherwise returns -1
	 */
	static int first(int arr[], int low, int high, int x, int n) {
		if (high >= low) {
			/* low + (high - low)/2; */
			int mid = (low + high) / 2;
			if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
				return mid;
			else if (x > arr[mid])
				return first(arr, (mid + 1), high, x, n);
			else
				return first(arr, low, (mid - 1), x, n);
		}
		return -1;
	}

	/*
	 * if x is present in arr[] then returns the index of LAST occurrence of x
	 * in arr[0..n-1], otherwise returns -1
	 */
	static int last(int arr[], int low, int high, int x, int n) {
		if (high >= low) {
			/* low + (high - low)/2; */
			int mid = (low + high) / 2;
			if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x)
				return mid;
			else if (x < arr[mid])
				return last(arr, low, (mid - 1), x, n);
			else
				return last(arr, (mid + 1), high, x, n);
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 3, 3 };

		// Element to be counted in arr[]
		int x = 3;
		int n = arr.length;
		int c = count(arr, x, n);
		System.out.println(x + " occurs " + c + " times");
	}
}
