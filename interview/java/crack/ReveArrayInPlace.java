package interview.java.crack;

public class ReveArrayInPlace {

	public static void main(String args[]) {

		String arrs = "hello";

		int start = 0;

		int end = arrs.length() - 1;

		char[] c = arrs.toCharArray();

		while (start <= end) {

			char temp = c[start];

			c[start] = c[end];

			c[end] = temp;

			start++;

			end--;

		}

		for (int i = 0; i < c.length; i++)

			System.out.println("char is " + c[i]);

	}
}