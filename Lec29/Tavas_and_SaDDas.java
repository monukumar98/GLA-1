package Lec29;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "4747";
		System.out.println(luckynumber(str));

	}

	public static int luckynumber(String s) {

		int count = (1 << s.length()) - 2;
		int pos = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				count = count + (1 << pos);
			}
			pos++;
		}

		return count + 1;

	}

}
