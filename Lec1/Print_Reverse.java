package Lec1;

public class Print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printReverse("nitik");

	}

	public static void printReverse(String str) {

		if (str.length() == 0) {
			return;
		}
		printReverse(str.substring(1));
		char apnachar = str.charAt(0);
		System.out.println(apnachar);

	}

}
