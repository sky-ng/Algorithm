package com.sky.offer;

public class Problem53_2 {
    public int missingNumber(int[] nums) {
    	int l = 0, r = nums.length - 1;
    	while (l <= r) {
    		int mid = l + ((r - l) >> 1);
    		if (mid == nums[mid]) {
    			l = mid + 1;
    		} else {
    			r = mid - 1;
    		}
    	}
    	return r + 1;
    }
}
