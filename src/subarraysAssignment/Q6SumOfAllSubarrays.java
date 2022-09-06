package subarraysAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Q6SumOfAllSubarrays {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 3));
		System.out.println(subarraySum(A));
	}

	public static Long subarraySum(ArrayList<Integer> A) {
		Long sumOfAllSubarrays = 0L;
		int len = A.size();
		for (int L = 0; L < len; L++) {
			int sum = 0;
			for (int R = L; R < len; R++) {
				sum += A.get(R);
				sumOfAllSubarrays += sum;
			}
		}
		return sumOfAllSubarrays;
	}
	
	
	public static Long solveHardCase(ArrayList<Integer> A) {
		long sumOfAllSubarrays = 0;
		for (int i = 0; i < A.size(); i++) {
			long occurence = (long)(i+1)*(A.size()-i);
			sumOfAllSubarrays += (long)occurence*A.get(i);
		}
		return sumOfAllSubarrays;
	}
}
