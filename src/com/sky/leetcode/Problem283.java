package com.sky.leetcode;

public class Problem283 {
    public void moveZeroes(int[] nums) {
        int numLength = nums.length;
        if (numLength == 0 || numLength == 1) {
        	return;
        }
        int cnt = 0;
        for (int i = 0; i < numLength; i++) {
        	if (nums[i] != 0) {
        		nums[cnt++] = nums[i];
        	}
        }
        while (cnt < numLength) {
        	nums[cnt++] = 0;
        }
    }
}
