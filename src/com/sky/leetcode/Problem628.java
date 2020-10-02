package com.sky.leetcode;

import java.util.Arrays;

public class Problem628 {
    public int maximumProduct(int[] nums) {
    	Arrays.sort(nums);
    	int n = nums.length;
    	//全是非正数或全是非负数
    	if (nums[0] >= 0 || nums[n - 1] <= 0) {
    		return nums[n - 1] * nums[n - 2] * nums[n - 3];
    	}
    	//有正数也有负数
    	return nums[n - 1] * (nums[0] * nums[1] >= nums[n - 2] * nums[n - 3] ? 
    			(nums[0] * nums[1]) : (nums[n - 2] * nums[n - 3]));
    }
}
