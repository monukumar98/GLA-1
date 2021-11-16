package Lec3;

public class Climbing_Stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(noways(0, n));
		Print_path(0, n, "");

	}

	public static int noways(int curr, int dis) {
		if(curr==dis) {
			return 1;
		}
		if(curr>dis) {
			return 0;
		}

//		int Steps1 = noways(curr + 1, dis);
//		int Steps2 = noways(curr + 2, dis);
//		int Steps3 = noways(curr + 3, dis);
		int ans=0;
		for (int step = 1; step <=3; step++) {
			ans+=noways(curr+step, dis);
			
		}
		return ans;

	}

	
	
	public static void Print_path(int curr, int dis,String ans) {
		if(curr==dis) {
			System.out.println(ans);
			return ;
		}
		if(curr>dis) {
			return ;
		}

//		int Steps1 = noways(curr + 1, dis);
//		int Steps2 = noways(curr + 2, dis);
//		int Steps3 = noways(curr + 3, dis);
	
		for (int step = 1; step <=3; step++) {
			Print_path(curr+step, dis,ans+step);
			
		}
	

	}

}
