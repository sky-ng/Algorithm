package com.sky.contest;

import java.util.Arrays;

public class Week_196_2 {
    public int getLastMoment(int n, int[] left, int[] right) {
    	if (left.length == 0 && right.length == 0) return 0;
    	if (left.length == 0) {
    		Arrays.sort(right);
    		return n - right[0];
    	}
    	if (right.length == 0) {
    		Arrays.sort(left);
    		return left[left.length - 1];
    	}
    	Arrays.sort(left);
    	Arrays.sort(right);
    	int n_left = left.length;
    	int n_right = right.length;
    	//²»»áÅö×²
    	if (left[n_left - 1] < right[0]) {
    		return Math.max(left[n_left - 1], n - right[0]);
    	}
    	int ans = 0;
    	ans += (left[n_left - 1] - right[0]);
    	ans += Math.max(right[0], n - left[n_left - 1]);
    	return ans;
    }
}
