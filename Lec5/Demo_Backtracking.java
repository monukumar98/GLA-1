package Lec5;

public class Demo_Backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		print(arr, 0);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void print(int[] arr, int i) {
		if (i == arr.length) {
			return;
		}

		arr[i] = 10;
		print(arr, i + 1);
		arr[i]=0;
	}

}
