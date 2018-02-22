package interview.java.crack;

public class PositionToInsert {

	public static void main(String args[]) {

		int[] arrs = { 1, 3, 4, 5 };

		int[] newArray = new int[arrs.length + 1];
		int insert = 7 ;

		int position = 0;
		int i = 0;

		while (arrs[i] < insert || arrs[i] == insert) {
                   
			position = ++i; // to save the value in the variable we increment
							// before other after is also fine

			if (arrs[i] == insert) {
				System.out.println(" the number is already there " + arrs[i]);

				for (int j = 0; j < arrs.length; j++) {

					System.out.print(arrs[j]+" ");
				}
				return;
			}
		}

		// System.out.println(position);

		for (int j = 0; j < position; j++) {

			newArray[j] = arrs[j];

		}

		newArray[position] = insert;

		for (int j = position + 1; j < newArray.length; j++) {

			newArray[j] = arrs[j - 1];
		}

		for (int j = 0; j < newArray.length; j++) {

			System.out.println(newArray[j] + " ");
		}
	}
}






























