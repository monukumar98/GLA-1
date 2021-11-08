package Lec2;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = null;
//		System.out.println(arr);
//		arr = new int[5];
		// lenth
	//	System.out.println(arr.length);
		
		
//		System.out.println(arr[0]+" "+arr[1]);
//		swap(arr[0], arr[1]);
//		System.out.println(arr[0]+" "+arr[1]);
		int[]arr= {10,20,30,40,50};
		int [] other = {100,200,300};
       System.out.println(arr[0]+" "+other[0]);
       //swap(arr, other);
       swap1(arr, 0, 1);
       System.out.println(arr[0]+" "+other[0]);
		

	}
	
public static void swap1(int []a, int i, int j) {
	
	int t = a[i];
	a[i]=a[j];
	a[j]=t;
		
		
		
		
	}
public static void swap(int []a, int []b) {
		
		int[] t =a;
		 a = b;
		 b=t;
		
		
		
	}
	
	
	
	
	
	public static void swap(int a, int b) {
		
		int t =a;
		 a = b;
		 b=t;
		
		
		
	}
	
	

}
