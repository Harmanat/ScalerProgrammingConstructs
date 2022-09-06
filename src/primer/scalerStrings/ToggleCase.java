package primer.scalerStrings;

public class ToggleCase {
	public static void main(String[] args) {
		System.out.println(solve("tHiSiSaStRiNg"));
	}

	/**
	 * ASCII Values a-z: 97-122 A-Z: 65-90
	 */
	public static String solve(String A) {
		StringBuilder toggledCase = new StringBuilder();

		for (int i = 0; i <= A.length() - 1; i++) {
			char x = A.charAt(i);
			if ((int) x <= 90)
				toggledCase.append(String.valueOf(x).toLowerCase());
			else
				toggledCase.append(String.valueOf(x).toUpperCase());
		}

		return toggledCase.toString();
	}
}
