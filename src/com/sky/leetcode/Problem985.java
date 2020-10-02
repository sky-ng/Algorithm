package com.sky.leetcode;

public class Problem985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int ALength = A.length;
        int queriesLength = queries.length;
    	int[] ans = new int[ALength];
    	A[queries[0][1]] += queries[0][0];
    	int temp = 0;
    	for (int i = 0; i < ALength; i++) {
    		if (A[i] % 2 == 0) {
    			temp += A[i];
    		}
    	}
    	ans[0] = temp;
    	for (int i = 1; i < queriesLength; i++) {
    		temp = ans[i - 1];
    		if (A[queries[i][1]] % 2 == 0) {
    			temp = temp - A[queries[i][1]];
    		}
    		A[queries[i][1]] += queries[i][0];
    		if (A[queries[i][1]] % 2 == 0) {
    			temp = temp + A[queries[i][1]];
    		}
            ans[i] += temp;
    	}
    	return ans;
    }
}
