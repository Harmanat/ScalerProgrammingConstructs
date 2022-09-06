package twoDMatricesAssignment;

public class Q6MatrixTranspose {
	public static void main(String[] args) {
//		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] A = { { 24, 63, 39, 81, 84, 30 }, { 21, 64, 95, 6, 88, 73 }, { 33, 6, 63, 96, 86, 66 },
				{ 62, 88, 23, 52, 94, 77 }, { 81, 58, 74, 18, 16, 25 }, { 26, 40, 88, 64, 72, 23 },
				{ 45, 44, 86, 92, 50, 26 }, { 64, 34, 83, 26, 29, 68 }, { 43, 42, 7, 17, 45, 52 },
				{ 94, 25, 62, 19, 95, 77 } };

		solve(A);
	}

	public static int[][] solve(int[][] A) {
		int origRows = A.length;
		int origCols = A[0].length;

		int transposeMatrixRows = origCols;
		int transposeMatrixCols = origRows;

		int[][] transposeMatrix = new int[transposeMatrixRows][transposeMatrixCols];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				transposeMatrix[j][i] = A[i][j];
			}
		}
		
		for (int i = 0; i < transposeMatrix.length; i++) {
			for (int j = 0; j < transposeMatrix[0].length; j++) {
				System.out.print(transposeMatrix[i][j] + " ");
			}
			System.out.println();
		}
		return transposeMatrix;
	}
}
