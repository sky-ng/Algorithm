package com.sky.interview;

public class Problem17_16 {
	//2,1,4,5,3,1,1,3
	//2,1,6,7,9,8,10,12
	//2 2 6 7 9 9 10 12
    public int massage(int[] nums) {
    	if (nums.length == 0) {
    		return 0;
    	} else if (nums.length == 1) {
    		return nums[0];
    	} else if (nums.length == 2) {
    		return Math.max(nums[0], nums[1]);
    	} else {
    		int[] arr = new int[nums.length];
    		arr[0] = nums[0];
    		arr[1] = nums[0] > nums[1] ? nums[0] : nums[1];
    		for (int i = 2; i < arr.length; i++) {
    			int sum = arr[i - 2] + nums[i];
    			arr[i] = arr[i - 1] > sum ? arr[i - 1] : sum;
    		}
    		return arr[nums.length - 1];
    	}
    }
}
