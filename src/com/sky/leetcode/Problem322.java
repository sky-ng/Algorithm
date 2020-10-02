package com.sky.leetcode;

public class Problem322 {
    public int coinChange(int[] coins, int amount) {
    	int[] dp = new int[amount + 1];
    	dp[0] = 0;
    	for (int i = 1; i <= amount; ++i) {
    		dp[i] = 0x3f3f3f3f;
    		for (int coin : coins) {
    			if (i - coin >= 0) {
    				dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
    			}
    		}
    	}
    	return dp[amount] >= 0x3f3f3f3f ? -1 : dp[amount];
    }
}
