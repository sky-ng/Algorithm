package com.sky.leetcode;

public class Problem121 {
    public int maxProfit(int[] prices) {
    	if (prices.length == 0) return 0;
    	int max = Integer.MIN_VALUE;
    	int min = Integer.MAX_VALUE;
    	int res = 0;
    	for (int p : prices) {
    		if (p < min) {
    			min = p;
    			max = p;
    		}
    		if (p > max) {
    			max = p;
    		}
    		if (res < (max - min)) {
    			res = max - min;
    		}
    	}
    	return res;
    }
    
    public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4,0,1,9};
		System.out.println(new Problem121().maxProfit(prices));
	}
}
