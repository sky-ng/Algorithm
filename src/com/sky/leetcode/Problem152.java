package com.sky.leetcode;

public class Problem152 {
    public int maxProduct(int[] nums) {
    	int max = Integer.MIN_VALUE;
    	int imax = 1, imin = 1;
    	for (int n : nums) {
    		if (n < 0) {
    			int tmp = imax;
    			imax = imin;
    			imin = tmp;
    		}
    		imax = Math.max(imax * n, n);
    		imin = Math.min(imin * n, n);
    		max = Math.max(imax, max);
    	}
    	return max;
    }
}
