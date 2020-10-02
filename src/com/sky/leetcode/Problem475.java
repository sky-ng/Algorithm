package com.sky.leetcode;

import java.util.Arrays;

public class Problem475 {
    public int findRadius(int[] houses, int[] heaters) {
    	Arrays.sort(houses);
    	Arrays.sort(heaters);
    	int max = 0;
    	int heatersLength = heaters.length;
    	for (int house : houses) {
    		int i = 0;
    		while (i < heatersLength && heaters[i] < house) {
    			i++;
    		}
    		if (i == 0) {
    			max = Math.max(max, heaters[i] - house);
    		} else if (i == heatersLength) {
//    			max = Math.max(max, b);
    		}
    	}
        return max;
    }
}
