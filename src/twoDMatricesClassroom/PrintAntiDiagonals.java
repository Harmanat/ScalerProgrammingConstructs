package twoDMatricesClassroom;

public class PrintAntiDiagonals {
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		solve(A);
	}

	public static int[][] solve(int[][] A) {
		int len = A.length;
		int[][] res = new int[len][len];

		// printing all those diagonals with start as 1st row
		int i = 0;
		for (int j = 0; j < len; j++) {
			int I = i;
			int J = j;
			while (I < len && J >= 0) {
				System.out.print(A[I][J] + " ");
				I++;
				J--;
			}
			System.out.println();
		}

		// printing diagonals with i from 1 to n-1 and j = N-1
		int j = len - 1;
		for (i = 1; i < len; i++) {
			int I = i;
			int J = j;
			while(I<len && J >=0) {
				System.out.print(A[I][J] + " ");
				I++;
				J--;
			}
			System.out.println();
		}

		return res;
	}
}
