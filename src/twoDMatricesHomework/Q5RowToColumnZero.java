package twoDMatricesHomework;

public class Q5RowToColumnZero {
	public static int[][] solve(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				if (A[i][j] == 0) {
					// make the rows minimum, therefore row = i and col will go from 0 to A[0].length-1
					for (int col = 0; col < A[0].length; col++) {
						if(A[i][col] != 0)
							A[i][col] = Integer.MIN_VALUE;
					}

					// make the columns minimum, therefore col = j and row will go from 0 to A.length-1
					for (int row = 0; row < A.length; row++) {
						if(A[row][j] != 0)
							A[row][j] = Integer.MIN_VALUE;
					}
				}
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				if (A[i][j] == Integer.MIN_VALUE)
					A[i][j] = 0;
			}
		}
		return A;
	}

	public static void main(String[] args) {
//		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 0 }, { 9, 2, 0, 4 } };
		int A[][] = { { 97, 18, 55, 1, 50, 17, 16, 0, 22, 14 }, { 58, 14, 75, 54, 11, 23, 54, 95, 33, 23 },
				{ 73, 11, 2, 80, 6, 43, 67, 82, 73, 4 }, { 61, 22, 23, 68, 23, 73, 85, 91, 25, 7 },
				{ 6, 83, 22, 81, 89, 85, 56, 43, 32, 89 }, { 0, 6, 1, 69, 86, 7, 64, 5, 90, 37 },
				{ 10, 3, 11, 33, 71, 86, 6, 56, 78, 31 }, { 16, 36, 66, 90, 17, 55, 27, 26, 99, 59 },
				{ 67, 18, 65, 68, 87, 3, 28, 52, 9, 70 }, { 41, 19, 73, 5, 52, 96, 91, 10, 52, 21 }, };

//		int A[][] = {
//				{51, 21, 90, 38, 57, 12, 11, 1, 68, 60},
//				  {81, 24, 63, 97, 75, 70, 23, 91, 39, 84},
//				  {0, 21, 97, 12, 46, 48, 50, 3, 57, 69},
//				  {44, 8, 42, 34, 99, 0, 98, 10, 53, 67},
//				  {23, 34, 43, 86, 31, 18, 9, 54, 61, 48},
//				  {90, 61, 21, 87, 26, 67, 88, 28, 70, 45},
//				  {98, 14, 5, 92, 1, 4, 44, 99, 67, 98},
//				  {18, 42, 32, 61, 80, 64, 32, 89, 70, 93},
//				  {89, 61, 7, 10, 0, 85, 29, 40, 13, 0},
//				  {85, 63, 66, 43, 56, 67, 99, 0, 67, 66}
//		};
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + "   ");
			}
			System.out.println();
		}
		solve(A);

		System.out.println("*************************************");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
