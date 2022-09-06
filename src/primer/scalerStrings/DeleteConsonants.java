package primer.scalerStrings;

public class DeleteConsonants {
	public static void main(String[] args) {
		System.out.println(solve("interviewbit"));
	}
	
	public static String solve(String A) {
		StringBuilder vowels = new StringBuilder();
		for(int i = 0; i<=A.length()-1; i++) {
			char x = A.charAt(i);
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
				vowels.append(String.valueOf(x));
		}
		return vowels.toString();
    }
}
