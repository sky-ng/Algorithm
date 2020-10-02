package com.sky.leetcode;

public class Problem198 {
    public int rob(int[] nums) {
    	int n = nums.length;
    	if (n == 0) return 0;
    	else if (n == 1) return nums[0];
    	else {
    		int[] dp = new int[n];
    		dp[0] = nums[0];
    		dp[1] = Math.max(nums[0], nums[1]);
    		for (int i = 2; i < n; ++i) {
    			dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
    		}
    		return dp[n - 1];
    	}
    }
    
    public static void main(String[] args) {
    	Problem198 p = new Problem198();
    	System.out.println(p.rob(new int[] {1, 2, 3, 1}));
    	System.out.println(p.rob(new int[] {2, 7, 9, 3, 1}));
	}
}
