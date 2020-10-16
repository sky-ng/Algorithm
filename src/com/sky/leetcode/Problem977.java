package com.sky.leetcode;

public class Problem977 {
    public int[] sortedSquares(int[] A) {
    	int n = A.length;
    	int[] res = new int[n];
    	int cur = n - 1;
    	int l = 0, r = n - 1;
    	while (l <= r) {
    		if (Math.abs(A[l]) > Math.abs(A[r])) {
    			res[cur--] = A[l] * A[l];
    			++l;
    		} else {
    			res[cur--] = A[r] * A[r];
    			--r;
    		}
    	}
    	return res;
    }
}
