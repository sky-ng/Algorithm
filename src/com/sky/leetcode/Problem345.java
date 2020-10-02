package com.sky.leetcode;

public class Problem345 {
	
	private boolean judge(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
				c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		} else {
			return false;
		}
	}
	
	private void swap(char[] chs, int l, int r) {
		char c = chs[l];
		chs[l] = chs[r];
		chs[r] = c;
	}
	
    public String reverseVowels(String s) {
    	char[] chs = s.toCharArray();
    	int l = 0;
    	int r = chs.length - 1;
    	while (l < r) {
    		if (judge(chs[l]) && judge(chs[r])) {
    			swap(chs, l, r);
    			l++;
    			r--;
    		} else if (!judge(chs[l]) && !judge(chs[r])) {
    			l++;
    			r--;
    		} else if (judge(chs[l])) {
    			r--;
    		} else {
    			l++;
    		}
    	}
    	return new String(chs);
    }
    
    public static void main(String[] args) {
    	Problem345 p =new Problem345();
    	System.out.println(p.reverseVowels("hello"));
	}
}
