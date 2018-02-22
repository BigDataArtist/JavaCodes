package interview.java.crack;

public class RecursionEvenNos {

	public static int SumOfEven(int num) {

		if (num == 0) {
			return 0;
		}

		if (num % 2 == 0) {

			System.out.println(" Num is" + num);

			System.out.println("num%10 " + num % 10 + " SumOfEven " + num / 10);
			return num % 10 + SumOfEven(num / 10);   

		}

		else {
			System.out.println("SumOfEven" + num / 10);
			return SumOfEven(num / 10);
		}
	}

	public static void main(String args[]) {

		System.out.println("sum is " + SumOfEven(4356));
	}
}

class SumRecur {

	public static int SumOf1ToN(int num) {
		if (num == 1) {
			return 1;
		}
		/*
		 * Formula for calculation sum of numbers first N numbers s(num) =
		 * s(num-1) + num; s(2) = s(2-1) + 2; = 3
		 */
		else {
			
			System.out.println(" num is "+num );
			return SumOf1ToN((num - 1)) + num;
			
		}
	}

	public static void main(String args[]) {

		System.out.println("Sum is " + SumOf1ToN(3));

	}
}
