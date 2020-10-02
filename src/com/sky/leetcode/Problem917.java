package com.sky.leetcode;

public class Problem917 {
    public String reverseOnlyLetters(String S) {
    	char[] ch_arr = S.toCharArray();
    	int i = 0, j = ch_arr.length - 1;
    	while (i < j) {
    		if (isLetter(ch_arr[i]) && isLetter(ch_arr[j])) {
    			swap(ch_arr, i, j);
    			++i;
    			--j;
    		} else if (isLetter(ch_arr[i])) {
    			--j;
    		} else if (isLetter(ch_arr[j])) {
    			++i;
    		} else {
    			++i;
    			--j;
    		}
    	}
    	return String.valueOf(ch_arr);
    }
    
    private void swap(char[] ch_arr, int i, int j) {
    	char temp = ch_arr[i];
    	ch_arr[i] = ch_arr[j];
    	ch_arr[j] = temp;
    }
    
    private boolean isLetter(char c) {
    	return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
