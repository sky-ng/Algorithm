package com.sky.leetcode;

public class Problem1523 {
    public int countOdds(int low, int high) {
    	if (low % 2 == 0 && high % 2 == 0) {
    		return (high - low) / 2;
    	} else if (low % 2 == 1 && high % 2 == 1) {
    		return (high - low) / 2 + 1;
    	} else {
    		return (high - low - 1) / 2 + 1;
    	}
    }
}
