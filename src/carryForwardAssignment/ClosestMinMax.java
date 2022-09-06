package carryForwardAssignment;

public class ClosestMinMax {

	public static void main(String[] args) {
//		int[] A = { 1, 6, 4, 6, 5, 1, 5, 2, 6, 4, 4, 2 };
//		int[] A = {1};
		int[] A = { 814, 761, 697, 483, 981};
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		int ans = Integer.MAX_VALUE;
		int minI = -1;
		int maxI = -1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		// find minimum value
		for (int i = 0; i < A.length; i++) {
			if (A[i] < min)
				min = A[i];
		}

		// find maximum value
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max)
				max = A[i];
		}

		if(min == max) return 1;
		for (int i = 0; i < A.length; i++) {
			// stop at a max value update the max to A[i]
			// then look for the location of the last minimium value if it exists.
			// find the distance between them and update in ans if ans already has a bigger
			// value in it
			if (A[i] == max) {
				if (minI != -1)
					ans = Math.min(ans, i - minI + 1);
				maxI = i;
			} else if (A[i] == min) {
				if (maxI != -1)
					ans = Math.min(ans, i - maxI + 1);
				minI = i;
			}
		}

		return ans;
	}

}
