package com.sky.leetcode;

public class Problem961 {
    public int repeatedNTimes(int[] A) {
    	if (A[1] == A[3]) {
    		return A[1];
    	}
        for (int i = 0; i < A.length-1; i++) {
        	if (A[i] == A[i+1]) {
        		return A[i];
        	}
        }
    	return A[0];
    }
}
