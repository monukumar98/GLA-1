package Lec11;

import java.util.Arrays;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 7, 1, 7, 5 };
		int[] arr2 = { 1, 9, 2, 5, 1 };
		int[][] dp = new int[arr1.length][arr2.length];

		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(lcs(arr1, arr2, 0, 0, dp));
	}

	public static int lcs(int[] arr1, int[] arr2, int i, int j, int[][] dp) {
		if (i == arr1.length || j == arr2.length) {
			return 0;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int ans = 0;
		if (arr1[i] == arr2[j]) {
			ans = 1 + lcs(arr1, arr2, i + 1, j + 1, dp);
		} else {
			int fs1 = lcs(arr1, arr2, i + 1, j, dp);
			int ss1 = lcs(arr1, arr2, i, j + 1, dp);
			ans = Math.max(fs1, ss1);

		}
		return dp[i][j] = ans;

	}

}
