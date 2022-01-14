package Lec10;

public class Distinct_Subsequences {
	public static void main(String[] args) {
		String s = "rabbbit";
		String t = "rabbit";
		System.out.println(noofways(s, t, 0, 0));
	}

	// s-->coin , m-- index
	// t --> amount , n-- idnex
	public static int noofways(String s, String t, int m, int n) {
		if (n == t.length()) {
			return 1;
		}
		if (m == s.length()) {
			return 0;
		}

		int inc = 0;
		int exc = 0;
		// inc
		if (s.charAt(m) == t.charAt(n)) {
			inc += noofways(s, t, m + 1, n + 1);
		}
		exc += noofways(s, t, m + 1, n);
		return inc+exc;

	}

}
