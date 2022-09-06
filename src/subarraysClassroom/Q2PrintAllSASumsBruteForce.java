package subarraysClassroom;

public class Q2PrintAllSASumsBruteForce {
	public static void main(String[] args) {
		int[] A = { 1, 3, 7, 2};
		solve(A);
	}
	
	public static void solve(int[] A) {
		int len = A.length;
		if (len < 0) {
			System.out.println("Input array is empty");
			return;	
		}
		for (int L = 0; L < len; L++) {
			for (int R = L; R < len; R++) {
				int sum = 0;
				for (int i = L; i <= R; i++) {
					System.out.print(A[i]);
					sum += A[i];
				}
				if (sum != 0)
					System.out.print(" sum: " + sum);
				System.out.println();
			}
			System.out.println();
		}
	}
}
