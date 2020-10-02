package com.sky.offer;

public class Problem57 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int[] res = new int[2];
        while (left < right) {
        	int sum = nums[left] + nums[right];
        	if (sum == target) {
        		res[0] = nums[left];
        		res[1] = nums[right];
        		return res;
        	} else if (sum < target) {
        		left++;
        	} else {
        		right--;
        	}
        }
        return res;
    }
}
