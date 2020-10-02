package com.sky.leetcode;

public class Problem1014 {
    public int maxScoreSightseeingPair(int[] A) {
    	int n = A.length;
    	int ans = 0;
    	int preMax = A[0];
    	for (int i = 1; i < n; ++i) {
    		ans = Math.max(ans, preMax + A[i] - i);
    		preMax = Math.max(preMax, A[i] + i);
    	}
    	return ans;
    }
}
