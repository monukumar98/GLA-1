package Lec9;

public class Climbing_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		System.out.println(noofways(n));
		int [] dp = new int [n+1];
		System.out.println(noofwaysDp(n, dp));

	}

	public static int noofways(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}

		int one = noofways(n - 1);
		int two = noofways(n - 2);
		return one + two;

	}

	public static int noofwaysDp(int n, int[] dp) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		// dp Apply krnege
		if (dp[n] != 0) {
			return dp[n];
		}

		int one = noofwaysDp(n - 1, dp);
		int two = noofwaysDp(n - 2, dp);

		return dp[n] = one + two;// ans yaad kr rahe ho and return bhi kr rahe ho

	}

}
