package Lec14;

import java.util.Stack;

public class PGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 4, 2, 20, 40, 12, 30 };
		PrevGreaterElement(arr);

	}

	public static void PrevGreaterElement(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int pge[] = new int[arr.length];
		pge[0] = -1;
		s.push(0);
		for (int i = 1; i < arr.length; i++) {

			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				s.pop();

			}
			if (s.isEmpty()) {
				pge[i] = -1;
			} else {
				pge[i] = arr[s.peek()];
			}
			s.push(i);
		}
		for (int i = 0; i < pge.length; i++) {
			System.out.println(arr[i] + "-->" + pge[i]);
		}
	}
}
