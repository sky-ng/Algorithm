package com.sky.leetcode;

public class Problem35 {
	public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = left + ((right - left) >> 1);
        while (left <= right) {
        	if (target == nums[middle]) {
        		return middle;
        	} else if (target < nums[middle]) {
        		right = middle - 1;
        	} else {
        		left = middle + 1;
        	}
        	middle = left + ((right - left) >> 1);
        }
		return left;
    }
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		int target = 0;
		System.out.println(new Problem35().searchInsert(nums, target));
	}
}
