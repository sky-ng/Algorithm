package com.sky.leetcode;

public class Problem357 {
    public int countNumbersWithUniqueDigits(int n) {
    	if (n == 0) return 1;
    	else if (n == 1) return 10;
    	else if (n > 10) return countNumbersWithUniqueDigits(10);
    	else {
    		int temp1 = 9;
    		int temp2 = 9;
    		for (int i = 0; i < n - 1; ++i) {
    			temp1 *= (temp2--);
    		}
    		return countNumbersWithUniqueDigits(n - 1) + temp1;
    	}
    }
}
