package Lec4;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		//GenerateParentheses(n, 0, 0, "");
		List<String> list = new ArrayList<>();
		GenerateParentheses_Leetcode(n, 0, 0, "", list);
		System.out.println(list);

	}

	public static void GenerateParentheses_Leetcode(int n, int opening, int closing, String ans, List<String> list) {
		
		if (opening == n && closing == n) {
			//System.out.println(ans);
			list.add(ans);
			return;
		}

		if (opening < n) {
			GenerateParentheses_Leetcode(n, opening + 1, closing, ans + "(",list);
		}
		if (closing < opening) {
			GenerateParentheses_Leetcode(n, opening, closing + 1, ans + ")",list);
		}
		

	}

	public static void GenerateParentheses(int n, int opening, int closing, String ans) {
		if (opening == n && closing == n) {
			System.out.println(ans);
			return;
		}

		if (opening < n) {
			GenerateParentheses(n, opening + 1, closing, ans + "(");
		}
		if (closing < opening) {
			GenerateParentheses(n, opening, closing + 1, ans + ")");
		}

	}

}
