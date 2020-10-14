package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem1002 {
    public List<String> commonChars(String[] A) {
    	int n = A.length;
    	int[][] arr = new int[n][26];
    	for (int i = 0; i < n; ++i) {
    		for (char c : A[i].toCharArray()) {
    			arr[i][c - 'a']++;
    		}
    	}
    	List<String> ans = new ArrayList<>();
    	for (int i = 0; i < 26; ++i) {
    		int max = 0x3f3f3f3f;
    		for (int j = 0; j < n; ++j) {
    			if (arr[j][i] < max) {
    				max = arr[j][i];
    			}
    		}
    		for (int j = 0; j < max; ++j) {
    			ans.add(String.valueOf((char)('a' + i)));
    		}
    	}
    	return ans;
    }
}
