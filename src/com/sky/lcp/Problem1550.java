package com.sky.lcp;

public class Problem1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
    	int idx = 0;
    	while (idx < arr.length - 2) {
    		if (arr[idx] % 2 == 1) {
    			if (arr[idx + 1] % 2 == 1 && arr[idx + 2] % 2 == 1) return true;
    			idx += 2;
    		} else {
    			++idx;
    		}
    	}
    	return false;
    }
}
