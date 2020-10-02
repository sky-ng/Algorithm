package com.sky.leetcode;

public class Problem1342 {
    public int numberOfSteps (int num) {
    	int res = 0;
    	while (num != 0) {
    		++res;
    		num = num % 2 == 0 ? (num / 2) : (num - 1);
    	}
    	return res;
    }
}
