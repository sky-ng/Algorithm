package com.sky.leetcode;

public class Problem75 {
    public void sortColors(int[] nums) {
    	int n = nums.length;
    	int p0 = 0, p1 = 0, p2 = n - 1;
    	while (p1 <= p2) {
    		if (nums[p1] == 0) {
    			swap(nums, p0, p1);
    			++p0;
    			++p1;
    		} else if (nums[p1] == 1) {
    			++p1;
    		} else {
    			swap(nums, p1, p2);
    			--p2;
    		}
    	}
    }
    
    private void swap(int[] nums, int p, int q) {
    	int t = nums[p];
    	nums[p] = nums[q];
    	nums[q] = t;
    }
}
