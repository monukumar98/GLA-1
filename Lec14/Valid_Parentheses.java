package Lec14;

import java.util.Stack;

public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(){}[](){}";

		System.out.println(ValidParentheses(s));

	}

	public static boolean ValidParentheses(String s) {

		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char cch = s.charAt(i);

			if (cch == '(' || cch == '{' || cch == '[') {
				st.push(cch);
			} else {
				if (st.isEmpty()) {
					return false;
				} else {
					char topch = st.pop();
					if (cch == '}' && topch == '{') {
						continue;
					}

					else if (cch == ')' && topch == '(') {
						continue;
					} else if (cch == ']' && topch == '[') {
						continue;
					}

					else {
						return false;
					}

				}
			}

		}
		return st.isEmpty();

	}

}
