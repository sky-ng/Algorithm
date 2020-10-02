package com.sky.offer;

public class Problem42 {
    public int maxSubArray(int[] nums) {
        int pre = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
        	if (pre > 0) {
        		pre += num;
        	} else {
        		pre = num;
        	}
        	max = Math.max(max, pre);
        }
        return max;
    }
}
