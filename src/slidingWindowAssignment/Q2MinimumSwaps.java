package slidingWindowAssignment;

public class Q2MinimumSwaps {
	public static void main(String[] args) {

		int[] A = new int[] { 52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27 };
		int B = 19;

		System.out.println(solve(A, B));
//		System.out.println("++++++++++++++++++++"+solveBF(A, B));
	}

	public static int solve(int[] A, int B) {
		int N = A.length;
		if (N == 1)
			return 0;
		int K = 0; // number of elements less than B
		for (int i = 0; i < N; i++) {
			if (A[i] <= B)
				K++;
		}


		// number of swaps in the first sub array
		int numOfSwaps = 0;
		for (int i = 0; i < K; i++) {
			if (A[i] > B)
				numOfSwaps++;
		}

		int ans = numOfSwaps;
		int L = 1;
		int R = K;
		while (R < N) {
			if (A[L - 1] > B)
				numOfSwaps--;
			if (A[R] > B)
				numOfSwaps++;
			ans = Math.min(ans, numOfSwaps);
			L++;
			R++;
		}

		return ans;
	}

	public static int solveBF(int[] A, int B) {
		int N = A.length;
		if (N == 1)
			return 0;

		int ans = Integer.MAX_VALUE;
		int K = 0; // number of elements less than B
		for (int i = 0; i < N; i++) {
			if (A[i] <= B)
				K++;
		}

//		System.out.println("N: " + N);
//		System.out.println("K: " + K);
		int L = 0;
		int R = K;
		while (R < N) {
			int numOfSwaps = 0;
			for (int i = L; i < R; i++) {
				if (A[i] > B)
					numOfSwaps++;
			}
			ans = Math.min(ans, numOfSwaps);
			L++;
			R++;
		}
		return ans;
	}

}
