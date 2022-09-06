package introductionToArraysHomework;

/**
 * Given an array A and an integer B, find the number of occurrences of B in A.
 * 
 */
public class Q2LinearSearchMultipleOccurences {

	public static void main(String[] args) {
		int A[] = {1, 2, 2};
		int B = 3;
		System.out.println(solve(A, B));

	}

	public static int solve(int[] A, int B) {
		int count = 0;
		for(int i = 0; i<A.length; i++) {
			if(A[i] == B)
				count++;
		}
		
		return count;
	}

}
