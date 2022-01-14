package Lec10;

import java.util.Arrays;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] cost = { 8, 4, 0, 5, 3 };
		int w = 4;
		int[][] dp = new int[wt.length][w + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(maximumcost(wt, cost, 0, w, dp));

	}

	public static int maximumcost(int[] wt, int[] cost, int i, int w, int[][] dp) {

		if (w == 0 || i == wt.length) {
			return 0;
		}
		if (dp[i][w] != -1) {
			return dp[i][w];
		}

		int inc = 0;
		int exc = 0;
		if (w >= wt[i]) {
			inc = cost[i] + maximumcost(wt, cost, i + 1, w - wt[i], dp);
		}
		exc = maximumcost(wt, cost, i + 1, w, dp);
		return dp[i][w] = Math.max(inc, exc);

	}

}
