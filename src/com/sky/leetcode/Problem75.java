package com.sky.leetcode;

public class Problem75 {
    public void sortColors(int[] nums) {
    	int p0 = 0, p2 = nums.length - 1, cur = 0;
    	while (cur <= p2) {
    		if (nums[cur] == 2) {
    			swap(nums, cur, p2);
    			--p2;
    		} else if (nums[cur] == 0) {
    			swap(nums, cur, p0);
    			++p0;
    			++cur;
    		} else {
    			++cur;
    		}
    	}
    }
    
    private void swap(int[] nums, int p, int q) {
    	int t = nums[p];
    	nums[p] = nums[q];
    	nums[q] = t;
    }
}
