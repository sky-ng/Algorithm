package com.sky.leetcode;

public class Problem125 {
    public boolean isPalindrome(String s) {
    	if (s == null || s.length() == 0) {
    		return true;
    	}
    	char[] chs = s.toCharArray();
    	int left = 0, right = chs.length - 1;
    	while (left < right) {
    		if (!isLetter(chs[left])) {
    			left++;
    			continue;
    		}
    		if (!isLetter(chs[right])) {
    			right--;
    			continue;
    		}
    		if (!judge(chs[left], chs[right])) {
    			return false;
    		}
    		left++;
    		right--;
    	}
    	return true;
    }
    
    private boolean isLetter(char c) {
    	if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    private boolean judge(char a, char b) {
    	if (a >= 'a' && a <= 'z') {
    		a -= ('a' - 'A');
    	}
    	if (b >= 'a' && b <= 'z') {
    		b -= ('a' - 'A');
    	}
    	return a == b;
    }
    
    public static void main(String[] args) {
    	Problem125 p = new Problem125();
    	String s = "A man, a plan, a canal: Panama";
    	p.isPalindrome(s);
	}
}
