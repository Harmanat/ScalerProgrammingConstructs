package twoDMatricesClassroom;

public class MatrixTransposeOfSquareMatrix {

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		solve(A);

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] solve(int[][] A) {

		for (int i = 1; i < A[0].length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}
		return A;
	}
}
