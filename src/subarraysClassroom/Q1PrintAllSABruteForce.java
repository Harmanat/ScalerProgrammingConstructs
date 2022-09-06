package subarraysClassroom;

public class Q1PrintAllSABruteForce {
	public static void main(String[] args) {
		int[] A = {1,3,7,2};
		solve(A);
	}
	
	public static void solve(int[] A) {
		int len = A.length;
		for(int L = 0; L<len; L++) {
			for(int R = L; R<len; R++) {
				for(int i = L; i<=R; i++) {
					System.out.print(A[i]);
				}
				System.out.println();
			}
		}
	}
}
