package com.sky.leetcode;

public class Problem1539 {
    public int findKthPositive(int[] arr, int k) {
    	int demandNum = 1;
    	int idx = 0;
    	while (idx < arr.length) {
    		if (arr[idx] != demandNum) {
    			--k;
    		} else {
    			++idx;
    		}
    		if (k == 0) return demandNum;
    		++demandNum;
    	}
    	while (--k > 0) {
    		++demandNum;
    	}
    	return demandNum;
    }
}
