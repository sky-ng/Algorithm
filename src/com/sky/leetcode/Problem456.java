package com.sky.leetcode;

import java.util.Stack;

public class Problem456 {
    public boolean find132pattern(int[] nums) {
    	int len = nums.length;
    	if (len < 3) {
    		return false;
    	}
    	int[] min = new int[len];
    	min[0] = nums[0];
    	for (int i = 1; i < len; i++) {
    		min[i] = Math.min(min[i - 1], nums[i]);
    	}
    	Stack<Integer> stack = new Stack<>();
    	for (int i = len - 1; i >= 0; i--) {
    		if (nums[i] > min[i]) {
    			while (!stack.empty() && stack.peek() <= min[i]) {
    				stack.pop();
    			}
    			if (!stack.empty() && stack.peek() < nums[i]) {
    				return true;
    			}
    			stack.push(nums[i]);
    		}
    	}
    	return false;
    }
}
