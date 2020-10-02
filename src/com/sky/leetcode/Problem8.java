package com.sky.leetcode;

public class Problem8 {
    public int myAtoi(String str) {
    	char[] s = str.trim().toCharArray();
    	int n = s.length;
    	if (n == 0) return 0;
    	int idx = 0;
    	boolean negative = false;
    	if (s[idx] == '-') {
    		idx++;
    		negative = true;
    	} else if (s[idx] == '+') {
    		idx++;
    	} else if (!Character.isDigit(s[idx])) {
    		return 0;
    	}
    	int ans = 0;
    	while (idx < n && Character.isDigit(s[idx])) {
    		int digit = s[idx] - '0';
    		if (ans > (Integer.MAX_VALUE - digit) / 10) {
    			return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    		}
    		ans = ans * 10 + digit;
    		idx++;
    	}
    	return negative ? -ans : ans;
    }
    
    public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
