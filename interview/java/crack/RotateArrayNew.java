package interview.java.crack;

import javax.sound.midi.SysexMessage;

public class RotateArrayNew {

	public static String[] first(String[] arr) {

		int n = arr.length;
		int r = 2;
		String[] firstArray = new String[arr.length - r];
		String[] ReverseArray = new String[arr.length - r];
		int len = firstArray.length;
		for (int i = 0; i < n - r; i++) {
			firstArray[i] = arr[i];
			System.out.println("firstArray[i]" + firstArray[i]);

		}

		for (int i = 0; i < firstArray.length; i++) {

			ReverseArray[i] = firstArray[len - i - 1];

			System.out.println(" Reverse array " + ReverseArray[i]);

		}

		return ReverseArray;
	}

	public static String[] last(String[] lastarr) {

		int n = lastarr.length;
		int r = 2;
		String[] last = new String[r];
		String[] revlast = new String[r];
		int len = last.length;
		for (int i = n - r, j = 0; i < n && j < r; i++, j++) {

			last[j] = lastarr[i];

			System.out.println("last j value " + last[j]);
		}

		for (int i = 0; i < last.length; i++) {

			revlast[i] = last[len - i - 1];

			System.out.println(" Reverse array last " + revlast[i]);

		}

		return revlast;
	}

	void merge(String[] revlast, String[] ReverseArray, String[] arr) {

		String[] merge = new String[arr.length];
		String[] finalMerge = new String[arr.length];
		String[] finalRotatedMerge = new String[arr.length];

		int r = 2;

		// System.out.println(" arr.lenght =" + arr.length);

		for (int i = 0; i < ReverseArray.length; i++) {
			merge[i] = ReverseArray[i];

			System.out.println(" merge is " + merge[i]);
		}

		for (int i = arr.length - revlast.length; i < merge.length; i++) {
			merge[i] = revlast[i - 5];

			System.out.println(" Merge here is " + merge[i]);

		}
		for (int i = 0; i < arr.length; i++) {
			finalMerge[i] = merge[i];

			System.out.println("finalMerge " + finalMerge[i]);
		}

		for (int i = 0; i < arr.length; i++) {

			int len = finalMerge.length;

			finalRotatedMerge[i] = finalMerge[len - i - 1];

			System.out.println(" Final Rotated merge " + finalRotatedMerge[i]);

		}
	}

	public static void main(String args[]) {

		RotateArrayNew rr = new RotateArrayNew();
		String[] newarr = { "a", "b", "c", "d", "e", "f", "g" };
		String[] arr = first(newarr);
		String[] lastarr = last(newarr);

		int n = arr.length;
		int r = 2;

		rr.merge(lastarr, arr, newarr);

	}
}

class Rearrange {

	public static int[] Arrange(int[] arr) {
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {

			int min = i;

			for (int j = i + 1; j < arr.length - 1; j++) {

				if (arr[j] < arr[min]) {

					min = j;

				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				count++;
			}

		}
		
		
		
		int[] newArray = new int[count];
	 
		for( int i = 0,j=0 ; i < arr.length && j <count;i++,j++){
			if(arr[i]<0){
			newArray[j] = arr[i];
			}
		}
		
		for( int i = 0 ; i < newArray.length;i++)
		System.out.print(newArray[i]+" ");
		
		

	return arr;

	}

	public static void main(String[] args) {

		int[] posNeg = { -1, -2, -3, 0, 1, 0, 1, 0, 0, 1, 1 };

		Arrange(posNeg);

	}
}
