package com.sky.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Problem1414 {
	
	private Deque<Integer> stack = new LinkedList<>();
	
    public int findMinFibonacciNumbers(int k) {
        int a = 1;
        int b = 1;
        stack.push(a);
        while (b <= k) {
        	stack.push(b);
        	int c = a + b;
        	a = b;
        	b = c;
        }
        int ans = 0;
        while (k > 0) {
        	k -= stack.peek();
        	++ans;
        	while (k > 0 && k < stack.peek()) {
        		stack.pop();
        	}
        }
        return ans;
    }
}
