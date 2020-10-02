package com.sky.leetcode;

public class Problem704 {
	
    public int search(int[] nums, int target) {
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
        return -1;
    }
	
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 2;
		System.out.println(new Problem704().search(nums, target));
	}
}
