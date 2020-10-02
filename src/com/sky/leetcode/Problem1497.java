package com.sky.leetcode;

public class Problem1497 {
    public boolean canArrange(int[] arr, int k) {
    	int[] reminder = new int[k];
    	for (int num : arr) {
    		int mod = num % k;
    		if (mod >= 0) {
    			++reminder[mod];
    		} else {
    			++reminder[mod + k];
    		}
    	}
    	if (reminder[0] % 2 != 0) return false;
    	for (int i = 1; i <= k / 2; ++i) {
    		if (reminder[i] != reminder[k - i]) return false;
    	}
    	return true;
    }
}
