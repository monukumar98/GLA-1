package Lec12;

import java.util.Arrays;

public class Knight_Dialer {
	static int r[] = { -2, -2, -1, -1, 1, 1, 2, 2 };
	static int c[] = { 1, -1, -2, 2, -2, 2, -1, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		int n = 3131;
		int[][][] dp = new int[n + 1][4][3];
		for (int[][] arr : dp) {
			for (int[] a : arr) {
				Arrays.fill(a, -1);
			}
		}

//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[i].length; j++) {
//				for (int j2 = 0; j2 < dp[i][j].length; j2++) {
//					
//				}
//				
//			}
//			
//		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				ans = (ans + KnightDialer(n - 1, i, j, dp)) % (1000000000 + 7);
			}

		}
		System.out.println(ans);

	}

	public static int KnightDialer(int n, int cr, int cc, int[][][] dp) {
		// -ve base
		if (cr < 0 || cc < 0 || cr >= 4 || cc >= 3 || (cr == 3 && cc == 0) || (cr == 3 && cc == 2)) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		if (dp[n][cr][cc] != -1) {
			return dp[n][cr][cc];
		}
		int count = 0;
		for (int i = 0; i < c.length; i++) {

			count = (count + KnightDialer(n - 1, cr + r[i], cc + c[i], dp)) % (1000000000 + 7);

		}
		return dp[n][cr][cc] = count;

	}

}
