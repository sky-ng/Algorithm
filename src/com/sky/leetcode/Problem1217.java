package com.sky.leetcode;

public class Problem1217 {
    public int minCostToMoveChips(int[] chips) {
    	int odd = 0, even = 0;
    	for (int chip : chips) {
    		if (chip % 2 == 0) {
    			++even;
    		} else {
    			++odd;
    		}
    	}
    	return Math.min(even, odd);
    }
}
