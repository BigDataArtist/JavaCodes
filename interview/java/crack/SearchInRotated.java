package interview.java.crack;

public class SearchInRotated {

	static int SearchElement(int[] arrs, int l, int h, int itemToSearch) {

		if (l > h) {
			return -1;
		}

		int mid = (l + h) / 2;

		System.out.println(" mid is " + mid);

		System.out.println(itemToSearch + " " + arrs[mid]);
		if (itemToSearch == arrs[mid]) {
			return mid;
		}

		/* If arrs[l...mid] is sorted */

		if (arrs[l] <= arrs[mid]) {
			System.out.println("arrs[1] " + arrs[1]);

			if (itemToSearch <= arrs[mid] && itemToSearch >= arrs[l]) 
				return SearchElement(arrs, 0, mid - 1, itemToSearch);
		}
			return SearchElement(arrs, mid + 1, h, itemToSearch);
		}

	/*	if (itemToSearch >= arrs[mid] && itemToSearch <= arrs[h]) {
			return SearchElement(arrs, mid + 1, h, itemToSearch);
		}
		return SearchElement(arrs, 0, mid - 1, itemToSearch);*/
	
	

	public static void main(String args[]) {

		int[] arrs = { 4, 5, 6, 7, 8, 9, 3, 2, 1 };

		int itemToSearch = 7;
		int N = arrs.length;

		int i = SearchElement(arrs, 0, N - 1, itemToSearch);

		if (i != -1) {
			System.out.println(" the index is " + i);
		}

		else {
			System.out.println(" else index not found ");
		}
	}

}
