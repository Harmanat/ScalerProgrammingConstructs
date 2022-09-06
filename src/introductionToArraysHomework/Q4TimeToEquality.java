package introductionToArraysHomework;

/**
 * Given an integer array A of size N. In one second, you can increase the value
 * of one element by 1. Find the minimum time in seconds to make all elements of
 * the array equal.
 */
public class Q4TimeToEquality {
	public static void main(String[] args) {
		int A[] = {2, 4, 1, 3, 2};
		System.out.println(solve(A));

	}

	public static int solve(int[] A) {
		int max = Integer.MIN_VALUE;
		int timeToEquality = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i]> max)
				max = A[i];
		}
		
		for(int i = 0; i<A.length; i++)
				timeToEquality += max-A[i];
		
		return timeToEquality;
	}
}
