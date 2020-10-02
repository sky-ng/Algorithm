package com.sky.leetcode;

public class Problem80 {
    public int removeDuplicates(int[] nums) {
    	int n = nums.length;
    	if (n == 0) return 0;
    	int left = 1, cnt = 1;
    	for (int right = 1; right < n; ++right) {
    		if (nums[right] == nums[right - 1]) {
    			cnt++;
    		} else {
    			cnt = 1;
    		}
    		if (cnt <= 2) {
    			nums[left++] = nums[right];
    		}
    	}
    	return left;
    }
}
