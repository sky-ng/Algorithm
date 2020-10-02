package com.sky.offer;

public class Problem3 {
	
	private void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
        	if (nums[i] != i) {
        		if (nums[i] == nums[nums[i]]) {
        			return nums[i];
        		}
        		swap(nums, i, nums[i]);
        	}
        }
        return 0;
    }
}
