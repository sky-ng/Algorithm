package com.sky.leetcode;

public class Problem673 {
    public int findNumberOfLIS(int[] nums) {
    	int n = nums.length;
    	int[][] dp = new int[n][2];
    	for (int i = 0; i < n; ++i) {
    		dp[i][0] = 1;
    		dp[i][1] = 1;
    	}
    	for (int i = 1; i < n; ++i) {
    		for (int j = 0; j < i; ++j) {
    			if (nums[i] > nums[j]) {
    				if (dp[i][0] < dp[j][0] + 1) {
    					dp[i][0] = dp[j][0] + 1;
    					dp[i][1] = dp[j][1];
    				} else if (dp[i][0] == dp[j][0] + 1) {
    					dp[i][1] += dp[j][1];
    				}
    			}
    		}
    	}
    	int maxNum = -0x3f3f3f3f;
    	int ans = 0;
    	for (int i = 0; i < n; ++i) {
    		if (maxNum < dp[i][0]) {
    			maxNum = dp[i][0];
    			ans = dp[i][1];
    		} else if (maxNum == dp[i][0]) {
    			ans += dp[i][1];
    		}
    	}
    	return ans;
    }
}
