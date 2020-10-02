package com.sky.leetcode;

public class Problem746 {
    public int minCostClimbingStairs(int[] cost) {
    	int len = cost.length;
    	int[] opt = new int[len];
    	opt[0] = cost[0];
    	opt[1] = cost[1];
    	for (int i = 2; i < len; i++) {
    		opt[i] = Math.min(opt[i-1], opt[i-2]) + cost[i];
    	}
        return Math.min(opt[len-1], opt[len-2]);
    }
    
    public static void main(String[] args) {
    	Problem746 p = new Problem746();
		System.out.println(p.minCostClimbingStairs(new int[] {10, 15, 20}));
		System.out.println(p.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
	}
}
