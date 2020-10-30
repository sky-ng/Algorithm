package com.sky.lcp;

public class Problem06 {
    public int minCount(int[] coins) {
    	int ans = 0;
    	for (int coin : coins) {
    		ans += (coin + 1) / 2;
    	}
    	return ans;
    }
}
