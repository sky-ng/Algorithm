package com.sky.leetcode;

public class Problem264 {
	
    public int nthUglyNumber(int n) {
        int cnt = 0;
        int i = 1;
        while (true) {
        	if (isUgly(i)) {
        		cnt++;
        	}
        	if (cnt == n) {
        		return i;
        	}
        	i++;
        }
    }
	
    public boolean isUgly(int num) {
    	if (num < 1) {
    		return false;
    	}
        while (num > 1) {
        	if (num % 5 == 0) {
        		num /= 5;
        	} else if (num % 3 == 0) {
        		num /= 3;
        	} else if (num % 2 == 0) {
        		num /= 2;
        	} else {
        		return false;
        	}
        }
    	return true;
    }
}
