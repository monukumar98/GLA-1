package Lec10;

import java.util.Arrays;
import java.util.Scanner;

public class Coin_Changes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int n = sc.nextInt();
		int[] coin = new int[n];
		for (int i = 0; i < coin.length; i++) {
			coin[i] = sc.nextInt();
		}
		int[][] dp = new int[amount+1][n];
		for (int[] a: dp) {
			Arrays.fill(a, -1);

		}
		System.out.println(no_of_ways(coin, amount, 0, dp));

	}

	public static int no_of_ways(int[] coin, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == coin.length) {
			return 0;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}
		int inc = 0;
		int exc = 0;
		// inc

		if (amount >= coin[i]) {
			inc = no_of_ways(coin, amount - coin[i], i, dp);
		}

		// exc
		exc = no_of_ways(coin, amount, i + 1, dp);
		return dp[amount][i] = inc + exc;

	}

}
