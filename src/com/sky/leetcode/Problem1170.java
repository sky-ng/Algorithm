package com.sky.leetcode;

import java.util.Arrays;

public class Problem1170 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
    	int[] wordCount = new int[words.length];
    	int[] ans = new int[queries.length];
    	for (int i = 0; i < words.length; ++i) {
    		wordCount[i] = f(words[i]);
    	}
    	Arrays.sort(wordCount);
    	for (int i = 0; i < queries.length; ++i) {
    		int cnt = f(queries[i]);
    		int j = wordCount.length - 1;
    		while (j >= 0 && wordCount[j] > cnt) {
    			--j;
    		}
    		ans[i] = wordCount.length - 1 - j;
    	}
    	return ans;
    }
    
    private int f(String s) {
    	char max_letter = 'z';
    	int cnt = 0;
    	for (char c : s.toCharArray()) {
    		if (c == max_letter) {
    			++cnt;
    		} else if (c < max_letter) {
    			max_letter = c;
    			cnt = 1;
    		}
    	}
    	return cnt;
    }
}
