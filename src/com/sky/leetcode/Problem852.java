package com.sky.leetcode;

public class Problem852 {
	public static void main(String[] args) {
		int A[] = {0, 7, 5, 3, 1, 0};
		System.out.println(new Problem852().peakIndexInMountainArray(A));
	}
    public int peakIndexInMountainArray(int[] A) {
    	int left = 0;
    	int right = A.length-1;
    	int middle = (left+right)/2;
    	while ((middle != left) && (middle != right)) {
    		if ((A[middle] > A[middle-1]) && (A[middle] > A[middle+1])) {
    			return middle;
    		} else {
    			if (A[middle] > A[middle-1]) {
    				left = middle;
    			} else {
    				right = middle;
    			}
    			middle = (left+right)/2;
    		}
    	}
    	return middle;
    }
}
