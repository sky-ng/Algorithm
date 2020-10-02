package com.sky.leetcode;

public class Problem434 {
    public int countSegments(String s) {
    	if (s == null || s.length() == 0) return 0;
    	int res = 0;
    	char[] ch_arr = s.toCharArray();
    	for (int i = 1; i < ch_arr.length; i++) {
    		if (ch_arr[i] == ' ' && ch_arr[i - 1] != ' ') {
    			res++;
    		}
    	}
    	if (ch_arr[ch_arr.length - 1] != ' ') {
    		res++;
    	}
    	return res;
    }
}
