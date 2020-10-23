package com.sky.leetcode;

public class Problem171 {
    public int titleToNumber(String s) {
    	int res = 0;
    	for (char c : s.toCharArray()) {
    		res = res * 26 + (c - 'A' + 1);
    	}
    	return res;
    }
}
