package com.sky.leetcode;

public class Problem771 {
    public int numJewelsInStones(String J, String S) {
    	//52个字母，小写在前，大写在后
    	boolean[] letters = new boolean[52];
    	int ans = 0;
    	for (char c : J.toCharArray()) {
    		if (c >= 'a' && c <= 'z') {
    			//小写
    			letters[c - 'a'] = true;
    		} else {
    			//大写
    			letters[c - 'A' + 26] = true;
    		}
    	}
    	for (char c : S.toCharArray()) {
    		if (c >= 'a' && c <= 'z' && letters[c - 'a']) {
    			//小写
    			++ans;
    			continue;
    		}
    		if (c >= 'A' && c <= 'Z' && letters[c - 'A' + 26]) {
    			//大写
    			++ans;
    		}
    	}
    	return ans;
    }
}
