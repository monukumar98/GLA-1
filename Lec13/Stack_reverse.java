package Lec13;

import java.util.Stack;

public class Stack_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		System.out.println("* ***** **** ** *****");
		reverse(st);
		System.out.println(st);

	}

	public static void reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}

		int item = st.pop();
		reverse(st);
		insertbottom(st, item);

	}

	private static void insertbottom(Stack<Integer> st, int item) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int i = st.pop();
		insertbottom(st, item);
		st.push(i);

	}

}
