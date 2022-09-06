package prefixSum;

public class EquilibriumIndexOfAnArray {
	public static void main(String[] args) {
		int[] A = {1,2,3};
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (i != 0)
				A[i] = A[i] + A[i - 1];
		}
		if(A[A.length-1]-A[0]==0)
			return 0;
		
		for (int i = 1; i < A.length; i++) {	
			int beforeSum = A[i - 1];
			int afterSum = A[A.length-1]-A[i];
			if (beforeSum == afterSum)
				return i;
		}
		return -1;
	}
}
