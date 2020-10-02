package com.sky.leetcode;

public class Problem1299 {
    public int[] replaceElements(int[] arr) {
    	int n = arr.length;
    	int[] ans = new int[n];
    	int max = -1;
    	for (int i = n - 1; i >= 0; --i) {
    		ans[i] = max;
    		max = Math.max(max, arr[i]);
    	}
    	return ans;
    }
}
