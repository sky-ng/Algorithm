package com.sky.leetcode;

public class Problem674 {
    public int findLengthOfLCIS(int[] nums) {
    	if (nums.length == 0) return 0;
    	int max = 1, cnt = 1;
    	for (int i = 1; i < nums.length; ++i) {
    		++cnt;
    		if (nums[i] > nums[i - 1]) {
    			max = Math.max(max, cnt);
    		} else {
    			cnt = 1;
    		}
    	}
    	return max;
    }
}
