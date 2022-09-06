package subarraysAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5MaximumSubarray {

	public static void main(String[] args) {
//		ArrayList<Integer> C = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5));
//		int A = 5;
//		int B = 12;
		
//		ArrayList<Integer> C = new ArrayList<>(Arrays.asList(2, 2, 2));
//		int A = 3;
//		int B = 1;
		
		ArrayList<Integer> C = new ArrayList<>(Arrays.asList( 7, 1, 8, 5, 8, 5, 3, 3, 5 ));
		int A = 9;
		int B = 78;
		
//		ArrayList<Integer> C = new ArrayList<>(Arrays.asList( 1, 2, 4, 4, 5, 5, 5, 7, 5 ));
//		int A = 9;
//		int B = 14;
		
		System.out.println(maxSubarray(A, B, C));
	}

	public static int maxSubarray(int A, int B, ArrayList<Integer> C) {
		int maxSubArraySum = 0;
		for (int L = 0; L < C.size(); L++) {
			int sum = 0;
			for (int R = L; R < C.size(); R++) { 
				sum += C.get(R);
				if(sum<=B)
					maxSubArraySum = Math.max(sum, maxSubArraySum);
			}
		}
		return maxSubArraySum;
	}

}
