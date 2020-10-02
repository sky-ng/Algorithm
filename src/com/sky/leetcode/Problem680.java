package com.sky.leetcode;

public class Problem680 {
	
	private boolean helper(String s, int l, int r) {
		while (l <= r) {
			if (s.charAt(l) == s.charAt(r)) {
    			l++;
    			r--;
    		} else {
    			return false;
    		}
		}
		return true;
	}
	
    public boolean validPalindrome(String s) {
    	int l = 0, r = s.length() - 1;
    	while (l <= r) {
    		if (s.charAt(l) == s.charAt(r)) {
    			l++;
    			r--;
    		} else {
    			return helper(s, l, r - 1) || helper(s, l + 1, r);
    		}
    	}
    	return true;
    }
}
