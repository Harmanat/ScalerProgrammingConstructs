package twoDMatricesHomework;

public class Q3AddTheMatrices {

	public static int[][] solve(int[][] A, int[][] B) {
		int[][] C = new int[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++)
				C[i][j] = A[i][j] + B[i][j];
		}
		return C;
	}

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] B = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] C = solve(A, B);

		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				System.out.print(C[i][j]);
			}
			System.out.println();
		}
	}

}
