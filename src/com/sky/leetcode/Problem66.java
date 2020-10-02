package com.sky.leetcode;

public class Problem66 {
    public int[] plusOne(int[] digits) {
    	int len = digits.length;
    	for (int i = len - 1; i >= 0; i--) {
    		digits[i] = (digits[i] + 1) % 10;
    		if (digits[i] != 0) {
    			return digits;
    		}
    	}
    	int[] res = new int[len + 1];
    	res[0] = 1;
    	for (int i = 0; i < len; i++) {
    		res[i + 1] = digits[i];
    	}
    	return res;
    }
}
