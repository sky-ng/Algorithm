package com.sky.leetcode;

public class Problem1221 {
    public int balancedStringSplit(String s) {
        char[] ch_arr = s.toCharArray();
        int res = 0;
        int stack = 0;
        for (char c : ch_arr) {
        	if (c == 'R') {
        		stack++;
        	} else {
        		stack--;
        	}
        	if (stack == 0) {
        		res++;
        	}
        }
        return res;
    }
}
