package com.sky.leetcode;

import java.util.Stack;

public class Problem946 {
	
    public boolean validateStackSequences(int[] pushed, int[] popped) {
    	int len = pushed.length;
    	if (len == 0) return true;
    	Stack<Integer> stack = new Stack<>();
    	int count = 0;
    	for (int i = 0; i < len; i++) {
    		stack.push(pushed[i]);
    		while (count != len && !stack.empty() && popped[count] == stack.peek()) {
    			stack.pop();
    			count++;
    		}
    		
    	}
    	return stack.empty();
    }
    
    public static void main(String[] args) {
    	Problem946 p = new Problem946();
		System.out.println(p.validateStackSequences(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5, 3, 2, 1}));
		System.out.println(p.validateStackSequences(new int[] {1, 2, 3, 4, 5}, new int[] {4, 3, 5, 1, 2}));
	}
}
