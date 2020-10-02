package com.sky.leetcode;

public class Problem1010 {
    public int numPairsDivisibleBy60(int[] time) {
    	int ans = 0;
    	int[] map = new int[60];
        for (int i = 0; i < time.length; ++i) {
        	time[i] %= 60;
        	++map[time[i]];
        }
        for (int i = 0; i < time.length; ++i) {
        	if (time[i] == 0 || time[i] == 30) {
        		ans += (map[time[i]] - 1);
        	} else {
        		ans += map[60 - time[i]];
        	}
        }
        return ans / 2;
    }
}
