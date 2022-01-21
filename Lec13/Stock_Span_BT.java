package Lec13;

public class Stock_Span_BT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 30, 31, 15, 32, 24, 11 };

		stockspan(arr);

	}

	private static void stockspan(int[] arr) {
		// TODO Auto-generated method stub

		int[] ans = new int[arr.length];
		for (int i = 0; i < ans.length; i++) {

			int c = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					c++;
				} else {
					break;
				}

			}
			ans[i] = c;

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
