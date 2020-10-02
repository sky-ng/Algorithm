package com.sky.leetcode;

import java.util.Arrays;

public class Problem34 {
	
	private int findFirst(int[] nums, int target) {
		int l = 0, r = nums.length;
		while (l < r) {
			int m = l + ((r - l) >> 1);
			if (nums[m] < target) {
				l = m + 1;
			} else {
				r = m;
			}
		}
		return l;
	}
	
    public int[] searchRange(int[] nums, int target) {
    	int left = findFirst(nums, target);
    	int right = findFirst(nums, target + 1) - 1;
    	if (nums == null || nums.length == left || nums[left] != target) {
    		return new int[] {-1, -1};
    	} else {
    		return new int[] {left, left < right ? right : left};
    	}
    }
    
    public static void main(String[] args) {
    	int[] res = new Problem34().searchRange(new int[] {5,7,7,8,8,10}, 8);
    	System.out.println(Arrays.toString(res));
	}
}
