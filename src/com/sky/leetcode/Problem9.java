package com.sky.leetcode;

public class Problem9 {
	
	private int helper(int x) {
		int res = 0;
		while (x != 0) {
			int temp = x % 10;
			x /= 10;
			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > 7)) {
				return -1;
			}
			if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && temp < -8)) {
				return -1;
			}
			res = res * 10 + temp;
		}
		return res;
	}
	
    public boolean isPalindrome(int x) {
        if (x < 0) {
        	return false;
        }
        int y = helper(x);
        if (y != -1) {
        	return x == y;
        } else {
        	return false;
        }
    }
}
