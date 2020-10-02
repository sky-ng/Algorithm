package com.sky.leetcode;

public class Problem1013 {
    public boolean canThreePartsEqualSum(int[] A) {
    	int sum = 0;
    	for (int i = 0; i < A.length; i++) {
    		sum += A[i];
    	}
    	if (sum % 3 != 0) {
    		return false;
    	}
    	int m = 0, n = A.length - 1;
    	int temp = sum / 3;
    	int leftSum = A[m], rightSum = A[n];
    	while (m < n) {
    		if (leftSum == temp && rightSum == temp) {
    			return true;
    		}
    		if (leftSum != temp) {
    			m++;
    			leftSum += A[m];
    		}
    		if (rightSum != temp) {
    			n--;
    			rightSum += A[n];
    		}
    	}
    	return false;
    }
    
    public static void main(String[] args) {
		
	}
}
