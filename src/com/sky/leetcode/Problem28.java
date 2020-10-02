package com.sky.leetcode;

public class Problem28 {
    public int strStr(String haystack, String needle) {
    	if (needle.length() == 0) {
    		return 0;
    	}
    	if (haystack.length() == 0) {
    		return -1;
    	}
    	char[] text = haystack.toCharArray();
    	char[] pattern = needle.toCharArray();
    	int[] b = new int[pattern.length + 1];
    	int j = -1, i = 0;
    	b[i] = j;
    	while (i < pattern.length) {
    		while (j >= 0 && pattern[i] != pattern[j]) {
    			j = b[j];
    		}
    		i++;
    		j++;
    		b[i] = j;
    	}
    	j = 0;
    	i = 0;
    	while (j < text.length) {
    		while (i >= 0 && text[j] != pattern[i]) {
    			i = b[i];
    		}
    		i++;
    		j++;
    		if (i == pattern.length) {
    			return j - i;
    		}
    	}
    	return -1;
    }
}
