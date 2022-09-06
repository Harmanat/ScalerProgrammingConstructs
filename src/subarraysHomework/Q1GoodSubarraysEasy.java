package subarraysHomework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array of integers A, a subarray of an array is said to be good if it
 * fulfills any one of the criteria: 1. Length of the subarray is be even, and
 * the sum of all the elements of the subarray must be less than B. 2. Length of
 * the subarray is be odd, and the sum of all the elements of the subarray must
 * be greater than B. Your task is to find the count of good subarrays in A
 *
 */
public class Q1GoodSubarraysEasy {
	public static void main(String[] args) {
//		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//		int B = 4;

		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9));
		int B = 65;

		System.out.println(solveCarryForward(A, B));
	}

	public static int solveCarryForward(ArrayList<Integer> A, int B) {
		int goodArrays = 0;
		int N = A.size();
		for (int L = 0; L < N; L++) {
			int sum = 0;
			for (int R = L; R < N; R++) {
				sum += A.get(R);
				int countElements = R - L + 1;
				if ((countElements % 2 == 0 && sum < B) || (countElements % 2 != 0 && sum > B))
					goodArrays++;
			}
		}
		return goodArrays;
	}
}
