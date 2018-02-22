package interview.java.crack;

import java.util.Scanner;

/*To understand code put 
 * sysout and always run in debugger
 */
public class sparseMatrix {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" define the size of the matrix");
		double result;
		int m = sc.nextInt();
		int n = sc.nextInt();

		double[][] sparse = new double[m][n]; // M is rows and N is column

		int zeros = 0;

		System.out.println(" Eneter the elements in the matrix");
		for (int i = 0; i < m; i++) { // rows
			for (int j = 0; j < n; j++) { // columns

				System.out.println(" i is " + i + " j is " + j);
				sparse[i][j] = sc.nextDouble();
				if (sparse[i][j] == 0) {
					zeros++;
				}
			}
		}

		// if m = 2 & n = 2 then 2*2/2 = 2.0 , so no of zeros in the matrix
		// should be greater than average to be sparse
		if (zeros > (m * n) / 2) {

			System.out.println(result = (m * n) / 2);
			System.out.println(" matrix is a sparse matrix");
		}

		else {
			System.out.println(" Not a sparse nmatrix");
		}

		sc.close();

	}

}
