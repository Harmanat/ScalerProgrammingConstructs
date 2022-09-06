package introductionToArraysAssignment;

/**
 * Given an array A and an integer B. A pair(i, j) in the array is a good pair
 * if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 * 
 * 
 */
public class Q2GoodPair {

	/**
	 * TIME and SPACE COMPLEXITY
	 * 
	 * Let length of Array A be N:
	 * 
	 * TC = O(N^2)
	 * SC = O(1)
	 * 
	 */
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4 };
		int B = 7;
		System.out.println(solve(A, B));

	}

	public static int solve(int[] A, int B) {
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (i == j)
					break;
				if (A[i] + A[j] == B)
					return 1;
			}
		}
		return 0;
	}
	
}
