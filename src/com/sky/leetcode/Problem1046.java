package com.sky.leetcode;

import java.util.Arrays;

public class Problem1046 {
    public int lastStoneWeight(int[] stones) {
    	int len = stones.length;
    	while (len > 1) {
    		Arrays.parallelSort(stones, 0, len--);
    		stones[len - 1] = stones[len] - stones[len - 1];
    	}
    	return stones[0];
    }
}
