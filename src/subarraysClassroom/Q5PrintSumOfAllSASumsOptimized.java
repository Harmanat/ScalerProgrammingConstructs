package subarraysClassroom;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5PrintSumOfAllSASumsOptimized {
	public static void main(String[] args) {
//		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 3));
//		System.out.println(subarraySum(A));
		
		int[] A = {2,1,3};
		System.out.println(subarraySum(A));
	}

	public static Long subarraySum(ArrayList<Integer> A) {
		long sumOfAllSubarrays = 0;
		for (int i = 0; i < A.size(); i++) {
			long occurence = (i+1)*(A.size()-i);
			sumOfAllSubarrays += (long)occurence*A.get(i);
		}
		return sumOfAllSubarrays;
	}
	
    public static long subarraySum(int[] A) {
        long ans = 0;
        int n = A.length;
        for (int i = 0; i < n; i++)
            ans += (long)A[i] * (i + 1) * (n - i);
        return ans ;
    }
}
