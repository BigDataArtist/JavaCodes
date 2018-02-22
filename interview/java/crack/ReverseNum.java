package interview.java.crack;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int rev = 0;
		int n, r;

		System.out.println(" Enter the number to reverse");
		n = sc.nextInt();

		while (n > 0) {

			r = n % 10; // if n = 523 , r will be 523%10 = 3
			n = n / 10; // n = 523/10 = 52 which is greater than 0 so loop still
						// goes on until n = 0

			rev = rev * 10 + r; // it keeps on adding in rev which keeps saving
								// in the stack
			System.out.println("rev here is" + rev);
		}

		System.out.println("reverse is" + rev);
	}

}

class Solution {
	public static int reverse(int x) {
		long rev = 0;
		int n;
		int r;

		int myrev = x; // this will hold the negetive value
		x = x < 0 ? x * -1 : x; // for negetive condition
		System.out.println(" x is  " + x);

		while (x > 0) {
			r = x % 10;
			x = x / 10;

			rev = rev * 10 + r;

			System.out.println(" rev is " + rev);

		}

		if (myrev < 0) {

			System.out.println(" my rev is " + myrev);
			rev = rev * -1;
			System.out.println(" rev is " + rev);

		}
		if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int) rev;
		}
	}

	public static void main(String args[]) {
		int rev = reverse(-432);
		System.out.println(rev);
	}

}


