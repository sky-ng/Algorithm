package com.sky.leetcode;

import java.util.Arrays;

public class Problem300 {
    public int lengthOfLIS(int[] nums) {
    	int n = nums.length;
    	if (n <= 0) return 0;
    	int[] dp = new int[n];
    	Arrays.fill(dp, 1);
    	int ans = 1;
    	for (int i = 1; i < n; ++i) {
    		for (int j = 0; j < i; ++j) {
    			if (nums[j] < nums[i]) {
    				dp[i] = Math.max(dp[j] + 1, dp[i]);
    				ans = Math.max(ans, dp[i]);
    			}
    		}
    	}
    	return ans;
    }

    
    public static void main(String[] args) {
		int[] arr = {1,3,6,7,9,4,10,5,6};
		Problem300 p = new Problem300();
		System.out.println(p.lengthOfLIS(arr));
	}
}
