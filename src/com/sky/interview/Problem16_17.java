package com.sky.interview;

public class Problem16_17 {
    public int maxSubArray(int[] nums) {
    	int res = nums[0];
    	int temp = nums[0];
    	for (int i = 1; i < nums.length; i++) {
    		temp = Math.max(nums[i], nums[i] + temp);
    		res = Math.max(temp, res);
    	}
    	return res;
    }
}
