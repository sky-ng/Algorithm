package com.sky.leetcode;

import java.util.Arrays;

public class Problem1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
    	Arrays.sort(A);
    	int i = 0;
    	int sum = 0;
    	for (i = 0; i < A.length && K > 0 && A[i] < 0; i++) {
    		A[i] = -A[i];
    		sum += A[i];
    		K--;
    	}
    	if (K > 0 && K % 2 == 1) {
    		if (i > 0 && A[i] > A[i - 1]) {
    			sum -= 2 * A[i - 1];
    		} else {
    			sum -= A[i];
    			i++;
    		}
    	}
    	for (int j = i; j < A.length; j++) {
    		sum += A[j];
    	}
    	return sum;
    }
    
    public static void main(String[] args) {
    	int[] A = {-8, 3, -5, -3, -5, -2};
    	int K = 6;
    	Problem1005 p = new Problem1005();
    	int res = p.largestSumAfterKNegations(A, K);
    	System.out.println(res);
	}
}
