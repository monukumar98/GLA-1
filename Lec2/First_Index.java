package Lec2;

public class First_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 2, 5, 4, 24, 5, 5, 7 };
		System.out.println(Firstindex(arr, 0, 5));

	}

	public static int Firstindex(int[] arr, int i, int item) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}

		return Firstindex(arr, i + 1, item);

	}

}
