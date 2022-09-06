package subarraysHomework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array A of N non-negative numbers and a non-negative number B, you
 * need to find the number of subarrays in A with a sum less than B. We may
 * assume that there is no overflow.
 */
public class Q3CountingSubarraysEasy {

	public static void main(String[] args) {
//		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 5, 6));
//		int B = 10;

		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 11, 2, 3, 15));
		int B = 10;

		System.out.println(solve(A, B));
	}

	public static int solve(ArrayList<Integer> A, int B) {
		int result = 0;
		int len = A.size();
		for (int l = 0; l < len; l++) {
			int sum = 0;
			for (int r = l; r < len; r++) {
				sum += A.get(r);
				if (sum < B)
					result++;
			}
		}
		return result;
	}
}
