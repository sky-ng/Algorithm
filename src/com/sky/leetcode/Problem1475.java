package com.sky.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem1475 {
    public int[] finalPrices(int[] prices) {
    	int n = prices.length;
    	Deque<Integer> stack = new ArrayDeque<>();
    	for (int i = 0; i < n; ++i) {
    		int curPrice = prices[i];
    		while (!stack.isEmpty() && curPrice <= prices[stack.peek()]) {
    			int preIndex = stack.pop();
    			prices[preIndex] -= curPrice;
    		}
    		stack.push(i);
    	}
    	return prices;
    }
}
