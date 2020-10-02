package com.sky.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Problem1029 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return (o1[0] - o1[1]) - (o2[0] - o2[1]);
			}
		});
    	int sum = 0;
    	int len = costs.length / 2;
    	for (int i = 0; i < len; i++) {
    		sum += (costs[i][0] + costs[i + len][1]);
    	}
    	return sum;
    }
}
