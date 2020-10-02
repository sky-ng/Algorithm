package com.sky.lcp;

public class Problem19 {
    public int minimumOperations(String leaves) {
    	char[] str = leaves.toCharArray();
    	int n = str.length;
    	int[][] dp = new int[n][3];
    	dp[0][0] = str[0] == 'r' ? 0 : 1;
    	dp[0][1] = dp[0][2] = dp[1][2] = Integer.MAX_VALUE;
    	for (int i = 1; i < n; ++i) {
    		int isRed = str[i] == 'r' ? 1 : 0;
    		int isYellow = 1 - isRed;
    		dp[i][0] = dp[i - 1][0] + isYellow;
    		dp[i][1] = Math.min(dp[i - 1][1], dp[i - 1][0]) + isRed;
    		if (i >= 2) {
    			dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][2]) + isYellow;
    		}
    	}
    	return dp[n - 1][2];
    }
}
