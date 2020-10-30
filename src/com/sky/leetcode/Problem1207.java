package com.sky.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem1207 {
    public boolean uniqueOccurrences(int[] arr) {
    	int[] cnt = new int[2001];
    	for (int num : arr) {
    		++cnt[num + 1000];
    	}
    	Set<Integer> set = new HashSet<>();
    	for (int i = 0; i < 2001; ++i) {
    		if (cnt[i] != 0) {
        		if (set.contains(cnt[i])) {
        			return false;
        		} else {
        			set.add(cnt[i]);
        		}
    		}
    	}
    	return true;
    }
}
