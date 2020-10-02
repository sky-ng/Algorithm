package com.sky.leetcode;

import java.util.Arrays;

public class Problem16 {
	
	private int distance = Integer.MAX_VALUE;
	
	private int ans = 0;
	
    public int threeSumClosest(int[] nums, int target) {
    	Arrays.sort(nums);
    	int n = nums.length;
    	for (int j = 1; j < n - 1; ++j) {
    		int i = 0, k = n - 1;
    		while (i < j && j < k) {
    			int sum = nums[i] + nums[j] + nums[k];
    			if (sum < target) {
    				++i;
    			} else if (sum > target) {
    				--k;
    			} else {
    				return sum;
    			}
    			if (Math.abs(sum - target) < distance) {
    				ans = sum;
    				distance = Math.abs(sum - target);
    			}
    		}
    	}
    	return ans;
    }
}
