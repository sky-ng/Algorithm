package com.sky.leetcode;

import java.util.Arrays;

public class Problem287 {
    public int findDuplicate(int[] nums) {
        Arrays.parallelSort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
        	if (nums[i] == nums[i+1]) {
        		return nums[i];
        	}
        }
    	return -1;
    }
}
