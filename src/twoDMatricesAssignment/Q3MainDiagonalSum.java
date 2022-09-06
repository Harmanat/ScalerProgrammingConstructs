package twoDMatricesAssignment;

/**
 * You are given a N X N integer matrix. You have to find the sum of all the
 * main diagonal elements of A. Main diagonal of a matrix A is a collection of
 * elements A[i, j] such that i = j.
 *
 */
public class Q3MainDiagonalSum {
	public static void main(String[] args) {
		int[][] A = { { 1, -2, -3 }, { -4, 5, -6 }, { -7, -8, 9 } };
		System.out.println(solve(A));
	}

	public static int solve(int[][] A) {
		int sum = 0;
		for (int i = 0; i < A.length; i++)
			sum += A[i][i];
		return sum;
	}

}
