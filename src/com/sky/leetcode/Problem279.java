package com.sky.leetcode;

public class Problem279 {
    public int numSquares(int n) {
    	int[] dp = new int[n + 1];
    	for (int i = 1; i <= n; i++) {
    		dp[i] = i;
    		for (int j = 1; i - j * j >= 0; j++) {
    			dp[i] = dp[i] > (dp[i - j * j] + 1) ? (dp[i - j * j] + 1) : dp[i];
    		}
    	}
    	return dp[n];
    }
}