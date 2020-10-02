package com.sky.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem575 {
    public int distributeCandies(int[] candies) {
        int len = candies.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
        	set.add(candies[i]);
        }
        if (set.size() >= len / 2) {
        	return len / 2;
        }
    	return set.size() >= len / 2 ? len / 2 : set.size();
    }
}
