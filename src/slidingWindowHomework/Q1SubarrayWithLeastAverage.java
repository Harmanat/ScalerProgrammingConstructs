package slidingWindowHomework;

/**
 * Given an array of size N, find the subarray of size K with the least average.
 *
 */
public class Q1SubarrayWithLeastAverage {
	
	public static int solve(int[] A, int B) {
		int L = 1;
		int R = B;
		int index = 0;
		float sum = 0;
		for (int i = 0; i < R; i++) {
			sum += A[i];
		}
		float leastAvg = sum / B;
		while (R < A.length) {
			sum = sum - A[L - 1] + A[R];
			if (leastAvg > sum / B) {
				leastAvg = sum / B;
				index = L;
			}
			L++;
			R++;
		}
		return index;
	}

	public static void main(String[] args) {
//		int[] A = new int[] { 3, 7, 90, 20, 10, 50, 40 };
//		int B = 3;

//		int[] A = new int[] { 3, 7, 5, 20, -10, 0, 12 };
//		int B = 2;

		int[] A = new int[] { 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 };
		int B = 9;
		// expected output = 3

		System.out.println(solve(A, B));
	}

}