package Lec8;

public class TowerofHannio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		TOH(n, "Src", "Helper", "Dis");

	}

	public static void TOH(int n, String s, String h, String d) {

		if (n == 0) {
			return;
		}

		TOH(n - 1, s, d, h);// n-1 ko Src to Helper
		System.out.println(n + "th disk Move from " + s + " to " + d);
		TOH(n - 1, h, s, d);

	}

}
