package interview.java.crack;

import java.util.ArrayList;

public class arrangeNums {

	public static void main(String args[]) {

		int[] arrs = { 0, 1, 0, 1, 0, 1 };

		for (int i = 0; i < arrs.length-1; i++) {

			int min = i;

			for (int j = i + 1; j < arrs.length; j++) {

				if (arrs[j] < arrs[min]) {

					min = j;
				}
			}
				int temp = arrs[min];

				arrs[min] = arrs[i];

				arrs[i] = temp;

			}
	
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
}

class thiSsort {

	public static void main(String args[]) {

		int[] arrgs = { 0, 0, 1, 0, 1, 1, 1 };
		int count = 0;

		int num = 0;

		int c = 0;

		for (int i = 0; i < arrgs.length; i++) {

			System.out.println(count);
			if (arrgs[i] == 0) {
			    c = ++count;
			}
		}
		System.out.println(" count is " + c);

		System.out.println(" ");

		int[] zeros = new int[c];
		int[] once = new int[num];

		System.out.println(zeros.length);

		for( int i = 0 ; i < zeros.length;i++){
			
		if(arrgs[i] == 0){
		   zeros[i] = arrgs[i];
	}
		
		System.out.println(zeros[i]);

		}
		
	}
}

class SortArrange {

	public static void main(String args[]) {

		int[] arrs = { 0, 1, 0, 1, 1, 1, 0, 1 };
		int count = 0;

		for (int i = 0; i < arrs.length; i++) {
			if (arrs[i] == 0) {
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			arrs[i] = 0;
		}

		for (int i = count; i < arrs.length; i++) {

			arrs[i] = 1;
		}

		for (int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i]);
		}
	}

}


	