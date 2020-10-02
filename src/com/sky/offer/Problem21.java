package com.sky.offer;

public class Problem21 {
    public int[] exchange(int[] nums) {
        int len = nums.length, left = 0, right = len - 1;
        while (left < right) {
        	if (nums[left] % 2 == 0 && nums[right] % 2 == 1) {
        		swap(nums, left, right);
        		left++;
                right--;
        	}
        	if (nums[left] % 2 == 1) {
        		left++;
        	}
        	if (nums[right] % 2 == 0) {
        		right--;
        	}
        }
        return nums;
    }
    
    private void swap(int[] nums, int i, int j) {
    	nums[i] = nums[i] ^ nums[j];
    	nums[j] = nums[i] ^ nums[j];
    	nums[i] = nums[i] ^ nums[j];
    }
}
