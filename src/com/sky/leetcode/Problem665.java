package com.sky.leetcode;

public class Problem665 {
    public boolean checkPossibility(int[] nums) {
    	int cnt = 0;
    	int i = 1;
    	while (i < nums.length && cnt < 2) {
    		if (nums[i] >= nums[i - 1]) {
    			i++;
    			continue;
    		}
    		cnt++;
    		if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
    			nums[i] = nums[i - 1];
    		} else {
    			nums[i - 1] = nums[i];
    		}
    		i++;
    	}
    	return cnt <= 1;
    }
}
