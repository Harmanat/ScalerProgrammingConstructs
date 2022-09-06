package slidingWindowClassroom;

/**
 * Given a N*N array Print all the elements in clockwise fashion
 *
 */
public class Q1PrintNNMatrixInClockwiseFashion {
	public static void solve(int[][] A) {
		int len = A.length-1;

		int i = 0;
		int j = 0;

		while(len>0) {
			for (int k = 0; k < len; k++) {
				System.out.print(A[i][j] + " ");
				j++;
			}
			for (int k = 0; k < len; k++) {
				System.out.print(A[i][j] + " ");
				i++;
			}
			for (int k = 0; k < len; k++) {
				System.out.print(A[i][j] + " ");
				j--;
			}
			for (int k = 0; k < len; k++) {
				System.out.print(A[i][j] + " ");
				i--;
			}
			i++;
			j++;
			len = len-2;
			System.out.println();
			if(len == 0)
				System.out.print(A[i][j] + " ");
		}


	}

	public static void main(String[] args) {
		int[][] A = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } 
			};

		solve(A);
	}

}
