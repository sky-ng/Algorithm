package com.sky.leetcode;

public class Problem172 {
    public int trailingZeroes(int n) {
    	int res = 0;
    	for (int i = 5; i <= n; i += 5) {
    		int temp = i;
    		while (temp > 0 && temp % 5 == 0) {
    			++res;
    			temp /= 5;
    		}
    	}
    	return res;
    }
}
