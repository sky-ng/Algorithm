package com.sky.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem888 {
    public int[] fairCandySwap(int[] A, int[] B) {
    	int SA = 0, SB = 0;
    	Set<Integer> set = new HashSet<>();
        for (int a : A) {
        	SA += a;
        }
    	for (int b : B) {
    		SB += b;
    		set.add(b);
    	}
    	int temp = (SB - SA) / 2;
    	for (int a : A) {
    		if (set.contains(a + temp)) {
    			return new int[] {a, a + temp};
    		}
    	}
    	return null;
    }
}
