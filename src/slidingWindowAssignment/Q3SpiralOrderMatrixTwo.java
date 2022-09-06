package slidingWindowAssignment;

/**
 * Given an integer A, generate a square matrix filled with elements from 1 to
 * A2 in spiral order and return the generated square matrix.
 */
public class Q3SpiralOrderMatrixTwo {

	public static int[][] solve(int A) {
		int[][] arr = new int[A][A];

		int i = 0;
		int j = 0;
		int value = 1;
		while (A > 0) {
			for(int k = 1; k<A; k++) {
				arr[i][j] = value;
				value++;
				j++;
			}
			for(int k = 1; k<A; k++) {
				arr[i][j] = value;
				value++;
				i++;
			}
			for(int k = 1; k<A; k++) {
				arr[i][j] = value;
				value++;
				j--;
			}
			for(int k = 1; k<A; k++) {
				arr[i][j] = value;
				value++;
				i--;
			}
			

			if(A==1)
				arr[i][j] = value++;
			i++;
			j++;
			A = A-2;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int result [][] = solve(4);
		
		for(int i = 0; i<result.length; i++) {
			for(int j = 0; j<result.length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
