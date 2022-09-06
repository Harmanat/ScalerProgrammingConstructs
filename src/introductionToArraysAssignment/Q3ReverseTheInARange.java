package introductionToArraysAssignment;

public class Q3ReverseTheInARange {

	public static void main(String[] args) {
		int A[] = { 2, 5, 6};
		int B = 0;
		int C = 2;
		int[] result = solve(A, B, C);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] solve(int[] A, int B, int C) {
		int start = B;
		int end = C;

		while (start < end) {
			A[start] = A[start] + A[end];
			A[end] = A[start] - A[end];
			A[start] = A[start] - A[end];
			start++;
			end--;
		}
		return A;
	}
}
