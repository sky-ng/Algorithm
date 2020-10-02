package com.sky.leetcode;

public class Problem1370 {
    public String sortString(String s) {
    	int[] arr = new int[26];
    	int size = s.length();
    	StringBuilder ans = new StringBuilder();
    	for (char c : s.toCharArray()) {
    		++arr[c - 'a'];
    	}
    	while (size > 0) {
    		for (int i = 0; i < 26; ++i) {
    			if (arr[i] > 0) {
    				--arr[i];
    				ans.append((char)('a' + i));
    				--size;
    			}
    		}
    		for (int i = 25; i >= 0; --i) {
    			if (arr[i] > 0) {
    				--arr[i];
    				ans.append((char)('a' + i));
    				--size;
    			}
    		}
    	}
    	return ans.toString();
    }
}
