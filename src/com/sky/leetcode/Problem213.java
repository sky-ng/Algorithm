package com.sky.leetcode;

public class Problem213 {
    public int rob(int[] nums) {
    	int n = nums.length;
    	if (n == 0) return 0;
    	else if (n == 1) return nums[0];
    	else {
    		return Math.max(helper(nums, 0, n - 2), helper(nums, 1, n - 1));
    	}
    }
    
    private int helper(int[] nums, int i, int j) {
    	if (i == j) return nums[i];
    	int[] dp = new int[j - i + 1];
    	dp[0] = nums[i];
    	dp[1] = Math.max(nums[i], nums[i + 1]);
    	for (int m = 2; m < j - i + 1; ++m) {
    		dp[m] = Math.max(dp[m - 1], dp[m - 2] + nums[i + m]);
    	}
    	return dp[j - i];
    }
    
    public static void main(String[] args) {
    	Problem213 p = new Problem213();
		System.out.println(p.helper(new int[] {1, 2, 3, 1}, 0, 2));
		System.out.println(p.helper(new int[] {1, 2, 3, 1}, 1, 3));
	}
}
