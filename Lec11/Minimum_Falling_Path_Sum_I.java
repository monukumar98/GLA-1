package Lec11;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix.length];
		for (int[] a : dp) {
			Arrays.fill(a, Integer.MAX_VALUE);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			int c = minFallingPathSum1(matrix, 0, i,dp);
			ans = Math.min(ans, c);// 0,0 0,1 0,2

		}
		System.out.println(ans);

	}

	public static int minFallingPathSum1(int[][] matrix, int cr, int cc,int [][]dp) {
		if (cc < 0 || cr >= matrix.length || cc >= matrix.length) {
			return Integer.MAX_VALUE;
		}

		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!=Integer.MAX_VALUE) {
			return dp[cr][cc];
		}

		// (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).

		int p1 = minFallingPathSum1(matrix, cr + 1, cc - 1,dp);
		int p2 = minFallingPathSum1(matrix, cr + 1, cc,dp);
		int p3 = minFallingPathSum1(matrix, cr + 1, cc + 1,dp);

		return dp[cr][cc]=(Math.min(p2, Math.min(p1, p3)) + matrix[cr][cc]);

	}

}
