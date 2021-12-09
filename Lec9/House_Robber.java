package Lec9;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 1, 2 };
		System.out.println(robRec(arr, 0));
		int [] dp = new int [arr.length];
		 // for(int i=0; i<dp.length; i++){
        //     dp[i]=-1;
        // }
        Arrays.fill(dp,-1);
		System.out.println(robDp(arr, 0, dp));

	}

	public static int robDp(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		// dp Apply kro
		if (dp[i] != 0) {
			return dp[i];
		}

		int rob = arr[i] + robDp(arr, i + 2, dp);
		int dontrob = robDp(arr, i + 1, dp);

		return dp[i] = Math.max(rob, dontrob);// ans yaad kre ho ans return bhi kre ho

	}

	public static int robRec(int[] arr, int i) {

		if (i >= arr.length) {
			return 0;
		}

		int rob = arr[i] + robRec(arr, i + 2);
		int dontrob = robRec(arr, i + 1);

		return Math.max(rob, dontrob);

	}

	public int rob(int[] nums) {// Wrong Solution hai --> 2,1,1,2 answer 3 aayega but Correct output 4 hai
		int odd_sum = 0;
		int even_sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 != 0) {
				odd_sum += nums[i];
			} else {
				even_sum += nums[i];
			}
		}
		return Math.max(odd_sum, even_sum);

	}

}
