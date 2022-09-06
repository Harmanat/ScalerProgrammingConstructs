package introductionToArraysHomework;

/**
 * You are given an integer array A of length N. You are also given a 2D integer
 * array B with dimensions M x 2, where each row denotes a [L, R] query. For
 * each query, you have to find the sum of all elements from L to R indices in A
 * (1 - indexed). More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1]
 * + A[R] for each query.
 *
 */
public class Q5RangeSumQuery {

	public static void main(String[] args) {
//		int[] A = new int[] { 1, 2, 3, 4, 5 };
//		int[][] B = new int[][] { { 1, 4 }, { 2, 3 } };

//		int[] A = new int[] { 2, 2, 2};
//		int[][] B = new int[][] { { 1, 1 }, { 2, 3 } };

		int[] A = new int[] { 6, 3, 3, 6 };
		int[][] B = new int[][] { { 1, 4 }, { 1, 3 } };

		int[] res = solve(A, B);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	public static int[] solve(int[] A, int[][] B) {
		int[] res = new int[B.length];

		for (int i = 0; i < B.length; i++) {
			int L = B[i][0];
			int R = B[i][1];
			int sum = 0;
			if (R <= A.length) {
				for (int k = L - 1; k < R; k++) {
					sum += A[k];
				}
			}
			res[i] = sum;
		}

		return res;
	}

}
