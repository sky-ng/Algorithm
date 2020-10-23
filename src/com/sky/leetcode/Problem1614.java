package com.sky.leetcode;

public class Problem1614 {
    public int maxDepth(String s) {
    	int ans = 0;
    	int curDepth = 0;
    	for (char c : s.toCharArray()) {
    		if (c == '(') {
    			++curDepth;
    			ans = Math.max(ans, curDepth);
    		} else if (c == ')') {
    			--curDepth;
    		}
    	}
    	return ans;
    }
}
