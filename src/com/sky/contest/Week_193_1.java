package com.sky.contest;

public class Week_193_1 {
    public int[] runningSum(int[] nums) {
    	int[] ans = new int[nums.length];
    	int sum = nums[0];
    	for (int i = 1; i < nums.length; ++i) {
    		sum += nums[i];
    		ans[i] = sum;
    	}
    	return ans;
    }
}
