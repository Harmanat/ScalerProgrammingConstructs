package subarraysClassroom;

public class Q3PrintAllSASumN2PrefixSum {
	public static void main(String[] args) {
		int[] A = { 1, 3, 7, 2 };
		solve(A);
	}

	public static void solve(int[] A) {
		int len = A.length;
		if (len < 0) {
			System.out.println("Input array is empty");
			return;
		}

		// find the prefix sum
		int[] PS = new int[len];
		PS[0] = A[0];
		for (int i = 1; i < len; i++) {
			PS[i] = A[i] + PS[i - 1];
		}

		for (int L = 0; L < len; L++) {
			for (int R = L; R < len; R++) {
				System.out.print("L --> "+L);
				System.out.print(" & R --> "+R +" Sum: ");
				if( L == 0)
					System.out.println(PS[R]);
				else
					System.out.println(PS[R] - PS[L - 1]);
			}
		}
	}
}
