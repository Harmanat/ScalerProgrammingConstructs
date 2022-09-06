package primer.scalerStrings;

public class BalancedSubStrings {
	public static void main(String[] args) {
		long result = scalerSolution("010011");
		System.out.println(result);
	}

	public static int balancedString(String s) {
		int count0s = 0;
		int count1s = 0;
		int count = 0;

		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == '0')
				count0s++;
			else
				count1s++;
			if (count0s == count1s)
				count++;
		}
		if (count0s != count1s)
			return -1;
		return count;
	}
	
	public static long scalerSolution(String A) {
		long n = A.length();
		  long ans = 0;
		  long sum = 0;
		  for (int i = 0; i < n; i++) {
		    if (A.charAt(i) == '0') {
		      sum++;
		    } else {
		      sum--;
		    }
		    if (sum == 0) {
		      ans++;
		    }
		  }
		  return ans;
		
	}
}
