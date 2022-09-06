package prefixSum;

public class Q4InPlacePrefixSum {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5};
		solve(A);

		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

	public static int[] solve(int[] A) {
		for (int i = 1; i < A.length; i++) {
			A[i] += A[i-1]; 
		}
		return A;
	}

}
