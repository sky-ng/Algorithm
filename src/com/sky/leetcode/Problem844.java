package com.sky.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem844 {
    public boolean backspaceCompare(String S, String T) {
    	Deque<Character> stack = new ArrayDeque<>();
    	for (char c : S.toCharArray()) {
    		if (c != '#') {
    			stack.push(c);
    		} else {
    			if (!stack.isEmpty()) {
    				stack.pop();
    			}
    		}
    	}
    	StringBuilder sb1 = new StringBuilder();
    	while (!stack.isEmpty() ) {
    		sb1.append((char)stack.pop());
    	}
    	for (char c : T.toCharArray()) {
    		if (c != '#') {
    			stack.push(c);
    		} else {
    			if (!stack.isEmpty()) {
    				stack.pop();
    			}
    		}
    	}
    	StringBuilder sb2 = new StringBuilder();
    	while (!stack.isEmpty() ) {
    		sb2.append((char)stack.pop());
    	}
    	return sb1.toString().equals(sb2.toString());
    }
}
