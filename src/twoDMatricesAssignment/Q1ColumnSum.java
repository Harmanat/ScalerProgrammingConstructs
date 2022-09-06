package twoDMatricesAssignment;

/**
 * You are given a 2D integer matrix A, return a 1D integer array containing
 * column-wise sums of original matrix.
 *
 */
public class Q1ColumnSum {

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 2, 3, 4 } };
		for (int i : solve(A))
			System.out.println(i);
	}

	public static int[] solve(int[][] A) {
		int[] res = new int[A[0].length];
		for (int j = 0; j < A[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < A.length; i++)
				sum += A[i][j];
			res[j] = sum;
		}
		return res;
	}

}
