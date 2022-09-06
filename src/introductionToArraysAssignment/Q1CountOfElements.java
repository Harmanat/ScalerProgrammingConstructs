package introductionToArraysAssignment;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Description: Given an array A of N integers. Count the number of
 * elements that have at least 1 elements greater than itself.
 * 
 */
public class Q1CountOfElements {
	public static void main(String[] args) {
//		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(3, 1, 2));
//		System.out.println(solve(A));
//
//		ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(5, 5, 3));
//		System.out.println(solve(B));

		ArrayList<Integer> C = new ArrayList<Integer>(Arrays.asList(7, 4, 2, 10, 5, 10));
		System.out.println(solve(C));

	}

	/**
	 * The following is a nested loop brute force solution.
	 */
	public static int solveBrute(ArrayList<Integer> A) {
		int count = 0;
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.size(); j++) {
				if (A.get(i) < A.get(j)) {
					count++;
					break;
				}
			}
		}
		return count;
	}

	public static int solve(ArrayList<Integer> A) {
		int count = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) > max) {
				max = A.get(i);
				count = 1;
			} else if (A.get(i) == max)
				count++;
		}
		return A.size() - count;
	}
	
	/**
	 * TIME and SPACE COMPLEXITY
	 * 
	 * Let length of Array A be N:
	 * 
	 * TC = O(N)
	 * SC = O(1)
	 * 
	 */
}
