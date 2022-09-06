package primer.scalerStrings;

public class DiverseCharacters {

	public static void main(String[] args) {
		System.out.println(solve("M1234"));
	}

	/**
	 * ASCII Values A-Z: 65-90 a-z: 97-122
	 */
	public static int solve(String A) {
		int countAlphabets = 0;
		int countNumbers = 0;

		for (int i = 0; i <= A.length() - 1; i++) {
			char x = A.charAt(i);
			if (((int) x >= 65 && (int) x <= 90) || ((int) x >= 97 && (int) x <= 122))
				countAlphabets++;
			else if (x >= '0' || x <= '9')
				countNumbers++;
		}

		if (countAlphabets > countNumbers)
			return countAlphabets;
		else if (countAlphabets < countNumbers)
			return countNumbers;
		else
			return 0;
	}
}
