package com.sky.leetcode;

public class Problem485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
        	if (nums[i] == 1) {
        		cnt++;
        	} else {
        		max = Math.max(max, cnt);
        		cnt = 0;
        	}
        }
        max = Math.max(max, cnt);
        return max;
    }
}
