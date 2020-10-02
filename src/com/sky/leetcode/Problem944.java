package com.sky.leetcode;

public class Problem944 {
    public int minDeletionSize(String[] A) {
    	int res = 0;
    	for (int i = 0; i < A[0].length(); i++) {
    		for (int j = 1; j < A.length; j++) {
    			if (A[j].charAt(i) < A[j - 1].charAt(i)) {
    				res++;
    				break;
    			}
    		}
    	}
    	return res;
    }
    
    public static void main(String[] args) {
		String[] A = {"cba", "daf", "ghi"};
		System.out.println(new Problem944().minDeletionSize(A));
	}
}
