package Lec9;

public class FiboDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		// System.out.println(fib(n));
		int[] dp = new int[n + 1];
		System.out.println(fibdp(n, dp));

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int f1 = fib(n - 1);
		int f2 = fib(n - 2);

		return f1 + f2;

	}

	public static int fibdp(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		// dp apply kroge
		if (dp[n] != 0) {
			return dp[n];
		}
		int f1 = fibdp(n - 1, dp);
		int f2 = fibdp(n - 2, dp);
		dp[n] = f1 + f2;// ans ko yaad kiye ho
		return f1 + f2;

	}
	
	public static int fibspop(int n) {
		
		int a=0;
		int b=1;
		int i=1;
		while(i<=n) {
			int c = a+b;
			a=b;
			b=c;
			i++;
		}
		return a;
		
		
	}

}
