package introductionToArraysAssignment;

public class Q4ReverseTheArray {

	/*
	 In place swapping
		A = 20
		B = 10

		A = A+B -> 20+10 = 30
		B = A-B -> 30-10 = 20
		A = A-B -> 30-20 = 20
	*/
	
	/**
	 * TIME and SPACE COMPLEXITY
	 * 
	 * Let length of Array A be N:
	 * 
	 * TC = O(Length of Array)
	 * SC = O(1)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 1,1,10 };
		int[] B = solve(A);

		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}

	public static int[] solve(final int[] A) {
		int start = 0;
		int[] B = A;
		int end = B.length - 1;

		while (start < end) {
			B[start] = B[start] + B[end];
			B[end] = B[start] - B[end];
			B[start] = B[start] - B[end];
			start++;
			end--;
		}
		return B;
	}

}

