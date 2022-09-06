package twoDMatricesHomework;

/**
 * You are given a matrix A and and an integer B, you have to perform scalar
 * multiplication of matrix A with an integer B.
 *
 */

public class Q1MatrixScalerProduct {


	public static int[][] solve(int[][] A, int B) {
		for(int i = 0; i<A.length; i++) {
			for(int j = 0; j<A[0].length; j++) {
				A[i][j] = B*A[i][j];
			}
		}
		return A;
	}
	
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int B = 2;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
		solve(A, B);

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
	}
	
}
