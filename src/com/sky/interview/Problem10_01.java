package com.sky.interview;

public class Problem10_01 {
    public void merge(int[] A, int m, int[] B, int n) {
    	int insert_point = m + n - 1;
    	int p1 = m - 1, p2 = n - 1;
    	while (p1 >= 0 && p2 >= 0) {
    		if (A[p1] > B[p2]) {
    			A[insert_point--] = A[p1--];
    		} else {
    			A[insert_point--] = B[p2--];
    		}
    	}
    	while (p2 >= 0) {
    		A[insert_point--] = B[p2--];
    	}
    }
}
