package com.sky.leetcode;

public class Problem1189 {
    public int maxNumberOfBalloons(String text) {
    	int[] letters = new int[26];
    	for (char c : text.toCharArray()) {
    		letters[c - 'a']++;
    	}
    	int ans = Integer.MAX_VALUE;
    	ans = Math.min(ans, letters[0]);
    	ans = Math.min(ans, letters[1]);
    	ans = Math.min(ans, letters[11] / 2);
    	ans = Math.min(ans, letters[14] / 2);
    	ans = Math.min(ans, letters[13]);
    	return ans;
    }
}
