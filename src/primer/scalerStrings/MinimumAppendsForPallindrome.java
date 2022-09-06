package primer.scalerStrings;

/**
 * Given a string A consisting of lowercase characters. We need to tell minimum
 * characters to be appended (insertion at end) to make the string A a
 * palindrome.
 */
public class MinimumAppendsForPallindrome {
	public static void main(String[] args) {
		System.out.println(solve("aabb"));
	}

	public static int solve(String A) {
		int count = 0;
		for(int i = 0; i<= A.length()-1; i++) {
			String subStr = A.substring(i, A.length());
			boolean isPalindrome = isPalin(subStr);
			if(!isPalindrome)
				count++;
			else
				return count;
		}
		return count;
	}

	public static boolean isPalin(String A) {
		int len = A.length()-1;
		for (int i = 0; i <= A.length()-1; i++) {
			if (A.charAt(i) != A.charAt(len - i))
				return false;
		}
		return true;
	}
}
