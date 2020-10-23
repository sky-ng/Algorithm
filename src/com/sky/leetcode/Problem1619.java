package com.sky.leetcode;

import java.util.Arrays;

public class Problem1619 {
    public double trimMean(int[] arr) {
    	Arrays.sort(arr);
    	int n = arr.length;
    	int startIdx = n / 20, endIdx = n - n / 20 - 1;
    	double ans = 0;
    	for (int i = startIdx; i <= endIdx; ++i) {
    		ans += arr[i];
    	}
    	return ans / (endIdx - startIdx + 1);
    }
}
