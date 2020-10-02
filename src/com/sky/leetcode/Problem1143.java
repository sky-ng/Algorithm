package com.sky.leetcode;

public class Problem1143 {
    public int longestCommonSubsequence(String text1, String text2) {
    	char[] str_text1 = text1.toCharArray();
    	char[] str_text2 = text2.toCharArray();
    	int[][] dp = new int[str_text1.length + 1][str_text2.length + 1];
    	for (int i = 0; i < str_text1.length; ++i) {
    		dp[i][0] = 0;
    	}
    	for (int i = 0; i < str_text2.length; ++i) {
    		dp[0][i] = 0;
    	}
    	for (int i = 1; i <= str_text1.length; ++i) {
    		for (int j = 1; j <= str_text2.length; ++j) {
    			if (str_text1[i - 1] == str_text2[j - 1]) {
    				dp[i][j] = dp[i - 1][j - 1] + 1;
    			} else {
    				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
    			}
    		}
    	}
    	return dp[str_text1.length][str_text2.length];
    }
}
