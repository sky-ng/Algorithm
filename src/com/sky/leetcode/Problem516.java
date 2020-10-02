package com.sky.leetcode;

public class Problem516 {
    public int longestPalindromeSubseq(String s) {
        char[] ch_arr = s.toCharArray();
        int len = ch_arr.length;
        int[][] dp = new int[len][len];
        for (int i = len - 1; i >= 0; --i) {
        	dp[i][i] = 1;
        	for (int j = i + 1; j < len; ++j) {
        		if (ch_arr[i] == ch_arr[j]) {
        			dp[i][j] = dp[i + 1][j - 1] + 2;
        		} else {
        			dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
        		}
        	}
        }
        return dp[0][len - 1];
    }
    
    public static void main(String[] args) {
    	int a = new Problem516().longestPalindromeSubseq("bab");
    	System.out.println(a);
	}
}
