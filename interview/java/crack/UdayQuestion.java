package interview.java.crack;

public class UdayQuestion {

	public static void main(String args[]) {

		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizz buzz");

				continue;

			}

			else if (i % 3 == 0) {
				System.out.println("fizz");

				continue;
			}

			else if (i % 5 == 0) {
				System.out.println("buzz");
				continue;
			}

			System.out.println(i);
		}

	}
}
