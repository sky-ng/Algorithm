package com.sky.leetcode;

public class Problem1491 {
    public double average(int[] salary) {
    	int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    	int n = salary.length;
    	int sum = 0;
    	for (int s : salary) {
    		if (s > max) {
    			max = s;
    		}
    		if (s < min) {
    			min = s;
    		}
    		sum += s;
    	}
    	sum -= (min + max);
    	return 1.0 * sum / (n - 2);
    }
}
