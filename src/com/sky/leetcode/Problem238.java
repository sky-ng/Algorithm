package com.sky.leetcode;

public class Problem238 {
    public int[] productExceptSelf(int[] nums) {
    	int k = 1, n = nums.length;
    	int[] res = new int[n];
    	for (int i = 0; i < n; ++i) {
    		res[i] = k;
    		k *= nums[i];
    	}
    	k = 1;
    	for (int i = n - 1; i >= 0; --i) {
    		res[i] *= k;
    		k *= nums[i];
    	}
    	return res;
    }
}
