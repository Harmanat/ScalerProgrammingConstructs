package subarraysClassroom;

public class Q5PrintSumOfAllSASums {
	public static void main(String[] args) {
		int[] A = { 1, 3, 7, 2 };
		solve(A);
	}

	public static void solve(int[] A) {
		int len = A.length;

		int sumOfAllArrays = 0; // we need this extra variabl
		for (int L = 0; L < len; L++) {
			int sumOfEachArray = 0;
			for (int R = L; R < len; R++) {
				sumOfEachArray += A[R];
				sumOfAllArrays += sumOfEachArray;
			}
		}
		System.out.println("sumOfAllArrays: "+sumOfAllArrays);
	}
}
