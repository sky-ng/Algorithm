package com.sky.leetcode;

import java.util.Arrays;

public class Problem274 {
    public int hIndex(int[] citations) {
    	Arrays.sort(citations);
    	int n = citations.length, cnt = 0;
    	for (int i = n - 1; i >= 0; --i) {
    		if (citations[i] >= (cnt + 1)) {
    			++cnt;
    		}
    	}
    	return cnt;
    }
}
