package com.sky.interview;

public class Problem01_04 {
    public boolean canPermutePalindrome(String s) {
    	int[] ascii = new int[128];
    	for (char c : s.toCharArray()) {
    		++ascii[c];
    	}
    	int cnt = 0;
    	for (int i : ascii) {
    		if (i % 2 == 1) {
    			++cnt;
    		}
    	}
    	return cnt <= 1;
    }
}
