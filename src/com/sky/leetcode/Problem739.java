package com.sky.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Problem739 {
    public int[] dailyTemperatures(int[] T) {
    	int n = T.length;
    	int[] ans = new int[n];
    	Deque<Integer> stack = new LinkedList<>();
    	for (int i = 0; i < n; ++i) {
    		int currentTemperature = T[i];
    		while (!stack.isEmpty() && currentTemperature > T[stack.peek()]) {
    			int preIndex = stack.pop();
    			ans[preIndex] = i - preIndex;
    		}
    		stack.push(i);
    	}
    	return ans;
    }
}
