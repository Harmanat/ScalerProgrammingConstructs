package slidingWindowAssignment;

/**
 * Given an array A of length N. Also given are integers B and C. Return 1 if
 * there exists a subarray with length B having sum C and 0 otherwise
 *
 */
public class Q1SubarrayWithGivenSumAndLength {

	public static void main(String[] args) {
		int[] A = new int[] { 4, 3, 2, 6 };
		int B = 2;
		int C = 5;

//		int[] A = new int[] { 4, 2, 2 };
//		int B = 2;
//		int C = 8;

		System.out.println(solve(A, B, C));
	}

	public static int solve(int[] A, int B, int C) {
		int L = 0;
		int R = B - 1;
		int N = A.length;
		while (R < N) {
			int sum = 0;
			for (int i = L; i <= R; i++) {
				sum = sum + A[i];
			}
			if (sum == C)
				return 1;
			L++;
			R++;
		}
		return 0;
	}

}
