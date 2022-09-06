package subarraysAssignment;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * Given an array A of length N, return the subarray from B to C.
 * 
 * The first argument A is an array of integers The remaining arguments B and C
 * are integers.
 *
 */
public class Q4SubarrayInGivenRange {
	public static void main(String[] args) {
//		ArrayList<Integer> A = new ArrayList<>(Arrays.asList());
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 3, 2, 6));
//		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 2, 2));
				
		for (int i : solve(A, 0, 1))
			System.out.println(i);
		
		SAInRange();
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
		if (A.size() == 0)
			return A;
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = B; i <= C; i++) {
			res.add(A.get(i));
		}
		return res;
	}
	
	// Alternative technique
	public static void SAInRange() {
		int A[] = {4, 3, 2, 6};
		int B = 1;
		int C = 3;
		
		for (int i : Arrays.copyOfRange(A, B, C + 1))
			System.out.println(i);
			
	}
	

}
