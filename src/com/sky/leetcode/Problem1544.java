package com.sky.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem1544 {
    public String makeGood(String s) {
    	Deque<Character> stack = new ArrayDeque<>();
    	for (char c : s.toCharArray()) {
    		if (!stack.isEmpty() && helper(stack.peek(), c)) {
    			stack.poll();
    		} else {
    			stack.push(c);
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	while (!stack.isEmpty()) {
    		sb.append(stack.pop());
    	}
    	return sb.reverse().toString();
    }

	private boolean helper(char a, char b) {
		if ((a >= 'a' && a <= 'z' && a - 'a' + 'A' == b) || 
				(a >= 'A' && a <= 'Z' && a - 'A' + 'a' == b)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Problem1544 p = new Problem1544();
		System.out.println(p.makeGood("leEeetcode"));
	}
}
