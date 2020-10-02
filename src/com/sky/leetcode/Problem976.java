package com.sky.leetcode;

import java.util.Arrays;

public class Problem976 {
    public int largestPerimeter(int[] A) {
        Arrays.parallelSort(A);
        for (int i = A.length - 1; i >= 2; i--) {
        	if (A[i - 2] + A[i - 1] > A[i]) {
        		return A[i] + A[i - 1] + A[i - 2];
        	}
        }
    	return 0;
    }
}
