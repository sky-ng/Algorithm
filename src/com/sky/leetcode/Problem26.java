package com.sky.leetcode;

public class Problem26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return 0;
        }
        int p = 0, q = 0;
        while (q < nums.length) {
        	if (nums[p] != nums[q]) {
        		p++;
        		nums[p] = nums[q];
        	}
        	q++;
        }
        return p + 1;
    }
}
