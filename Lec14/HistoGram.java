package Lec14;

import java.util.Stack;

public class HistoGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(Area(arr));

	}

	public static int Area(int[] arr) {

		Stack<Integer> st = new Stack<>();
		int maxarea = 0;
		for (int i = 0; i < arr.length;) {
			if (st.isEmpty() || arr[i] > arr[st.peek()]) {
				st.push(i);
				i++;
			}

			else {
				int r = i;
				int h = arr[st.pop()];
				if (st.isEmpty()) {
					int pa = h * r;
					maxarea = Math.max(maxarea, pa);
				} else {
					int l = st.peek();
					int pa = h * (r - l - 1);
					maxarea = Math.max(maxarea, pa);
				}
				
			}
			

		}
		
		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if (st.isEmpty()) {
				int pa = h * r;
				maxarea = Math.max(maxarea, pa);
			} else {
				int l = st.peek();
				int pa = h * (r - l - 1);
				maxarea = Math.max(maxarea, pa);
			}
		}
		return maxarea;

	}
}
