package introductionToArraysAssignment;

/**
 * Given an integer array A of size N and an integer B, you have to return the
 * same array after rotating it B times towards the right.
 * 
 *
 */

/*
 * A : [ 7, 4, 2, 10, 5 ] B : 10
 */
public class Q5ArrayRotation {
	public static void main(String[] args) {
		int A[] = {7, 4, 2, 10, 5};
		int B = 10;
		int[] result = solve(A, B);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] solve(int[] A, int B) {
		if (B > A.length)
			B = B % A.length;

		int begin = 0;
		int end = A.length - 1;
		A = revArray(begin, end, A);

		begin = 0;
		end = B - 1;
		A = revArray(begin, end, A);

		begin = B;
		end = A.length - 1;
		A = revArray(begin, end, A);

		return A;
	}

	public static int[] revArray(int begin, int end, int[] A) {
		while (begin < end) {
			A[begin] = A[begin] + A[end];
			A[end] = A[begin] - A[end];
			A[begin] = A[begin] - A[end];
			begin++;
			end--;
		}
		return A;
	}
}
