package com.sky.leetcode;

public class Problem1446 {
    public int maxPower(String s) {
    	int max = 1;
    	int res = max;
    	char[] s_str = s.toCharArray();
    	int n = s_str.length;
    	for (int i = 1; i < n; ++i) {
    		if (s_str[i] == s_str[i - 1]) {
    			++max;
    		} else {
    			max = 1;
    		}
    		res = Math.max(res, max);
    	}
    	return res;
    }
}
