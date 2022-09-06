package introductionToArraysHomework;

/**
 * Given an array A of size N. You need to find the sum of Maximum and Minimum
 * element in the given array.
 */
public class Q1MaxMinOfAnArray {
	public static void main(String[] args) {
		int A[] = {-2, 1, -4, 5, 3};
//		System.out.println(solve(A));
		
		System.out.println(solveScalerSolution(A));
	}

	public static int solve(int[] A) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > max)
				max = A[i];
			if (A[i] < min)
				min = A[i];
		}
		return min + max;
	}
	
	public static int solveScalerSolution(int[] A) {
        final int inf = (int)(1e9);
        int mn = inf , mx = -inf;
        for(int i = 0 ; i < A.length ; i++){
            mn = Math.min(mn , A[i]);
            mx = Math.max(mx , A[i]);
        }
        return mn + mx;
    }
}
