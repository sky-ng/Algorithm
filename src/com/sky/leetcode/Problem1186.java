package com.sky.leetcode;

public class Problem1186 {
	
    public int maximumSum(int[] arr) {
    	int n = arr.length;
    	if (n == 1) return arr[0];
    	int[] f0 = new int[n];
    	int[] f1 = new int[n];
    	f0[0] = arr[0]; f0[1] = Math.max(arr[1], arr[1] + f0[0]);
    	f1[0] = 0; f1[1] = Math.max(arr[0], arr[1]);
    	int ans = max(f0[0], f0[1], f1[1]);
    	for (int i = 2; i < n; ++i) {
    		f0[i] = Math.max(arr[i], arr[i] + f0[i - 1]);
    		f1[i] = arr[i] + Math.max(f0[i - 2], f1[i - 1]);
    		ans = max(ans, f0[i], f1[i]);
    	}
    	return ans;
    }
    
    private int max(int a, int b, int c) {
    	return a > b ? Math.max(a, c) : Math.max(c, b);
    }
}
