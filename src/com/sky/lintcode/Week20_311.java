package com.sky.lintcode;

public class Week20_311 {
    public boolean isPalindrome(String s) {
    	int[] lowerCase = new int[26];
    	int[] upperCase = new int[26];
    	for (char c : s.toCharArray()) {
    		if (c >= 'a' && c <= 'z') {
    			++lowerCase[c - 'a'];
    		} else {
    			++upperCase[c - 'A'];
    		}
    	}
    	int flag = 0;
    	for (int num : lowerCase) {
    		if (num % 2 == 1) {
    			++flag;
    		}
    	}
    	for (int num : upperCase) {
    		if (num % 2 == 1) {
    			++flag;
    		}
    	}
    	return flag <= 1;
    }
}
