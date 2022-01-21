package Lec13;

import java.util.Stack;

public class Form_minimum_number_from_given_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "DDDIIDDD";
		formminimumNumber(str);
		printminnumber(str);

	}

	public static void formminimumNumber(String str) {
		int count = 1;
		int[] ans = new int[str.length() + 1];
		for (int i = 0; i <= str.length(); i++) {

			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = count;
				count++;
				int j = i - 1;
				while (j >= 0 && str.charAt(j) == 'D') {
					ans[j] = count;
					count++;
					j--;
				}

			}

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();

	}

	public static void printminnumber(String str) {

		Stack<Integer> st = new Stack<>();
		for (int i = 0; i <= str.length(); i++) {

			st.push(i + 1);
			if (i == str.length() || str.charAt(i) == 'I') {
				while (!st.isEmpty()) {
					System.out.print(st.pop() + " ");
				}
			}

		}
		System.out.println();

	}

}
