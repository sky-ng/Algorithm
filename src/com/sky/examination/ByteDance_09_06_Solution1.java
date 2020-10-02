package com.sky.examination;

import java.util.Scanner;

public class ByteDance_09_06_Solution1 {
	
	private static long helper(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else if (n == 2) return 2;
		else {
			long[][] dp = new long[n + 1][2];
			dp[1][0] = 1;
			dp[1][1] = 1;
			dp[2][0] = 2;
			dp[2][1] = 1;

			for (int i = 3; i <= n; ++i) {
				dp[i][0] = dp[i - 1][0] + dp[i - 2][1];
				dp[i][1] = dp[i - 1][0];
			}
			
			return dp[n][0];
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(helper(n));
	}
}
