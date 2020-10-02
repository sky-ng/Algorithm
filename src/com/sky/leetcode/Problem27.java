package com.sky.leetcode;

public class Problem27 {
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
        	if (nums[i] != val) {
        		nums[ans++] = nums[i];
        	}
        }
    	return ans;
    }
}
