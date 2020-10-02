package com.sky.leetcode;

public class Problem1395 {
    public int numTeams(int[] rating) {
        if (rating.length < 3) return 0;
        int ans = 0;
        for (int j = 1; j < rating.length - 1; ++j) {
        	for (int i = 0; i < j; ++i) {
        		for (int k = j + 1; k < rating.length; ++k) {
        			if ((rating[j] > rating[i] && rating[j] < rating[k]) 
        					|| (rating[j] < rating[i] && rating[j] > rating[k])) {
        				++ans;
        			}
        		}
        	}
        }
        return ans;
    }
}
