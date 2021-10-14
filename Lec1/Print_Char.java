package Lec1;

public class Print_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "hello";
//		System.out.println(str);
//		System.out.println(str.charAt(1));
//		System.out.println(str.length());
//		System.out.println(str.substring(1, 4));
//		//System.out.println(str.substring(2));
//		
//		str=str.substring(2);
//		System.out.println(str);//

	}

	public static void printchar(String str) {
		if(str.length()==0) {
			return;
		}

		char apnachar = str.charAt(0);
		System.out.println(apnachar);
		printchar(str.substring(1));

	}

}
