package Lec3;

public class Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 2, 5, 4, 24, 5, 5, 7 };
		System.out.println(LastIndex(arr, arr.length - 1, 5));

	}

	public static int LastIndex(int[] arr, int i, int item) {
		if(i<0) {
			return -1;
		}
		
		
		if(arr[i]==item) {
			return i;
		}
		
		return LastIndex(arr, i-1, item);

	}

}
