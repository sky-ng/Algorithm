package com.sky.leetcode;

public class Problem387 {
    public int firstUniqChar(String s) {
    	int[] ch_num = new int[26];
    	char[] ch_arr = s.toCharArray();
    	for (char c : ch_arr) {
    		ch_num[c - 'a']++;
    	}
    	for (int i = 0; i < ch_arr.length; i++) {
    		if (ch_num[ch_arr[i] - 'a'] == 1) {
    			return i;
    		}
    	}
    	return -1;
    }
}
