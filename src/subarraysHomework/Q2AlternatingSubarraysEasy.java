package subarraysHomework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are given an integer array A of length N comprising of 0's & 1's, and an
 * integer B.
 * 
 * You have to tell all the indices of array A that can act as a center of 2 * B
 * + 1 length 0-1 alternating subarray.
 * 
 * A 0-1 alternating array is an array containing only 0's & 1's, and having no
 * adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1
 * alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.
 * 
 *
 */

/**
 * 
 * https://www.scaler.com/academy/mentee-dashboard/class/34618/homework/problems/16123/discussion/p/java-tc-o-n-sc-o-1/21802
 *
 */
public class Q2AlternatingSubarraysEasy {
	public static void main(String[] args) {
//		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 0, 1, 0, 1));
//		int B = 1;

//		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 0, 1, 1, 0, 1));
//		int B = 0;

		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1));
		int B = 1; // Expected solution: 3 7 8

		System.out.println(solve(A, B));
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		ArrayList<Integer> result = new ArrayList<>();
		int requiredLength = 2 * B + 1;
		int len = A.size();
		for (int L = 0; L < len; L++) {
			for (int R = L; R < len; R++) {
				int currentLength = R - L + 1;
				if (requiredLength == currentLength) {
					int centerElement = isAlternatingArray(A, L, R);
					if (centerElement != -1)
						result.add(centerElement);
				}
			}
		}
		return result;
	}

	public static int isAlternatingArray(ArrayList<Integer> A, int L, int R) {
		ArrayList<Integer> subArray = new ArrayList<>();
		// getting the subArray
		for (int i = L; i <= R; i++)
			subArray.add(A.get(i));

		// traversing the array and verifying if it is an alternate array else returning
		// -1

		for (int j = 0; j < subArray.size() - 1; j++) {
			if (subArray.get(j) + subArray.get(j + 1) != 1)
				return -1;
		}
		// return the location of the array if all conditions are met
		return (L + R) / 2;

	}
}
