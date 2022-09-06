package twoDMatricesAssignment;

/**
 * 
 * You are given a N X N integer matrix. You have to find the sum of all the
 * minor diagonal elements of A.
 * 
 * Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such
 * that i + j = M + 1 (where i, j are 1-based).
 *
 */
public class Q4MinorDiagonalSum {
	public static void main(String[] args) {
		int[][] A = { { 1, -2, -3 }, { -4, 5, -6 }, { -7, -8, 9 } };
		System.out.println(solve(A));
	}

	public static int solve(int[][] A) {
		int sum = 0;
		int i = 0;
		int j = A.length - 1;
		while (j >= 0) {
			sum += A[i][j];
			i++;
			j--;
		}
		return sum;
	}

	public static int alternateSolution(int[][] A) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			int j = A.length - 1 - i;
			sum += A[i][j];
		}
		return sum;
	}
}
