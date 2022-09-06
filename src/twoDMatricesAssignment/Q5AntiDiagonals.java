package twoDMatricesAssignment;

/**
 * 
 * Give a N * N square matrix A, return an array of its anti-diagonals. Look at
 * the example for more details.
 *
 */

/**
 * Input array => N*N
 * 
 * Result 2D array of anti-diagonals has rows => N*N-1
 * 
 * Result 2D array of anti-diagonals has columns => N
 *
 */
public class Q5AntiDiagonals {
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int[][] A = { { 1, 2, 3, 123 }, { 4, 5, 6, 123 }, { 7, 8, 9, 123 }, { 123, 123, 123, 123, } };
		solve(A);
	}

	public static int[][] solve(int[][] A) {
		int len = A.length;
		int rowsOfResult = len + len - 1;
		int columnsOfResult = len;
		int[][] res = new int[rowsOfResult][columnsOfResult];

//		for (int row = 0; row < rowsOfResult; row++) {
//			for (int col = 0; col < columnsOfResult; col++) {
//				System.out.print(res[row][col]);
//			}
//			System.out.println();
//		}

//		for (int row = 0; row < rowsOfResult; row++) {
//			for (int col = 0; col < columnsOfResult; col++) {
//				res[row][col] = 0;
//			}
//		}

		// printing all those diagonals with start as 1st row
		int i = 0;
		for (int j = 0; j < len; j++) {
			int[] resRow = new int[columnsOfResult];
			int I = i;
			int J = j;
			while (I < len && J >= 0) {
//				System.out.print(A[I][J] + " ");
				resRow[I] = A[I][J];
				I++;
				J--;
			}

			for (int k = 0; k < resRow.length; k++) {
				res[i][k] = resRow[k];
				System.out.print(resRow[k]);
			}
			System.out.println();
			
			
			for (int row = 0; row < rowsOfResult; row++) {
				for (int col = 0; col < columnsOfResult; col++) {
					System.out.print(res[row][col]);
				}
				System.out.println();
			}
			
	
		}
		
		// printing diagonals with i from 1 to n-1 and j = N-1
		int j = len - 1;
		for (i = 1; i < len; i++) {
			int I = i;
			int J = j;
			while (I < len && J >= 0) {
				System.out.print(A[I][J] + " ");
				I++;
				J--;
			}
			System.out.println();
		}

		for (int row = 0; row < rowsOfResult; row++) {
			for (int col = 0; col < columnsOfResult; col++) {
				System.out.print(res[row][col] + " ");
			}
			System.out.println();
		}

		return res;
	}

}
