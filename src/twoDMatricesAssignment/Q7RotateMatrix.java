package twoDMatricesAssignment;

public class Q7RotateMatrix {
	public static void main(String[] args) {
//		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] A = { { 31, 32, 228, 333 }, { 79, 197, 241, 246 }, { 77, 84, 126, 337 }, { 110, 291, 356, 371 } };

		System.out.println("******** INPUT ********");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		solve(A);
	}

	public static int[][] solve(int[][] A) {

		if (A.length == 0)
			return A;

		// first we find the transpose of the matrix
		for (int i = 1; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}

		System.out.println("******** TRANSPOSE ********");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		// now we will reverse each row of the array
		for (int i = 0; i < A.length; i++) {
			int len = A.length - 1;
			for (int j = 0; j < A.length/2; j++) {
				int temp = A[i][j];
				A[i][j] = A[i][len];
				A[i][len] = temp;
				len--;
			}
		}

		System.out.println("******** REVERSE ********");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		return A;
	}

}
