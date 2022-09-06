package subarraysClassroom;

public class Q4PrintAllSASumN2CarryForward {
	public static void main(String[] args) {
		int[] A = {1,3,7,2};
		solve(A);
	}
	
	public static void solve(int[] A) {
		int len = A.length;
				
		for(int L = 0; L<len; L++) {
			int sum = 0;
			for(int R = L; R<len; R++) {
				sum += A[R];
				System.out.println("Sum --> "+sum);
			}
		}
	}
}
