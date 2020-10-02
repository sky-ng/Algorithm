package com.sky.leetcode;

public class Problem424 {
    public int characterReplacement(String s, int k) {
    	if (s == null || s.length() == 0) {
    		return 0;
    	}
    	char[] ch_arr = s.toCharArray();
    	int left = 0, right = 0;
    	int max = 0;
    	int[] letter_arr = new int[26];
    	for (right = 0; right < ch_arr.length; ++right) {
    		int index = ch_arr[right] - 'A';
    		letter_arr[index]++;
    		max = Math.max(max, letter_arr[index]);
    		if (right - left + 1 > max + k) {
    			letter_arr[ch_arr[left] - 'A']--;
    			left++;
    		}
    	}
    	return right - left;
    }
}
