package com.sky.offer;

public class Problem53_1 {
    public int search(int[] nums, int target) {
    	int cnt = 0;
    	int len = nums.length;
    	for (int i = 0; i < len; i++) {
    		if (target == nums[i]) {
    			cnt++;
    		}
    	}
    	return cnt;
    }
}
