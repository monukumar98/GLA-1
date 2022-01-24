package Lec14;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 30, 31, 15, 32, 24, 11 };

		stockspan(arr);

	}

	private static void stockspan(int[] arr) {
		// TODO Auto-generated method stub
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {

			while (!st.empty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}

			if (st.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();
			}

			st.push(i);

		}
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
