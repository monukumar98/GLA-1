package Lec11;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix.length];
		for (int[] a : dp) {
			Arrays.fill(a, Integer.MAX_VALUE);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			int c = minFallingPathSum2(matrix, 0, i, dp);
			ans = Math.min(ans, c);// 0,0 0,1 0,2

		}
		System.out.println(ans);

	}

	public static int minFallingPathSum2(int[][] matrix, int cr, int cc,int [][]dp) {
		if (cc < 0 || cr >= matrix.length || cc >= matrix.length) {
			return Integer.MAX_VALUE;
		}

		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!=Integer.MAX_VALUE) {
			return dp[cr][cc];
		}

		
		
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			if(i!=cc) {
				ans =Math.min(ans, minFallingPathSum2(matrix, cr+1, i, dp));
			}
			
		}

		return dp[cr][cc]=(ans + matrix[cr][cc]);

	}

}
