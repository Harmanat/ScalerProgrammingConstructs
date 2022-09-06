package carryForwardAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInAnArray {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));

		System.out.println(solve(A));

	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE;
		for(int i = A.size()-1; i>=0; i--) {
			if(A.get(i) > max) {
				max = A.get(i);
				res.add(max);
			}
		}
		
		return res;
	}
	
	public static ArrayList<Integer> solveBruteForce(ArrayList<Integer> A) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			boolean isLeader = true;
			for(int j = i; j< A.size(); j++) {
				if(A.get(i) < A.get(j)) {
					isLeader = false;
					break;
				}
			}
			if(isLeader)
				res.add(A.get(i));
		}
		return res;
	}
}
