package Lec6;

public class Key_Paid {

	static String[] getKey = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "198";
		Key_paid(str, "");

	}

	public static void Key_paid(String ques, String ans) {// 198, ""
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);// '1'
		String key = getKey[ch - 48];// abc

		for (int i = 0; i < key.length(); i++) {
			Key_paid(ques.substring(1), ans + key.charAt(i));// a
		}

//		Key_paid(ques.substring(1), ans+key.charAt(0));//a
//		Key_paid(ques.substring(1), ans+key.charAt(1));//b
//		Key_paid(ques.substring(1), ans+key.charAt(2));//c

	}

}
