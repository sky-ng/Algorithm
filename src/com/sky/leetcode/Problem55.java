package com.sky.leetcode;

public class Problem55 {
    public boolean canJump(int[] nums) {
        int good_point = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
        	if (i + nums[i] >= good_point) {
        		good_point = i;
        	}
        }
        return good_point == 0;
    }
}
