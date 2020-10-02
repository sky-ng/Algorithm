package com.sky.leetcode;

import java.util.Stack;

public class Problem844 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char ch : S.toCharArray()) {
        	if (ch == '#' && !stack1.empty()) {
        		stack1.pop();
        	} else if (ch != '#') {
        		stack1.push(ch);
        	}
        }
        for (char ch : T.toCharArray()) {
        	if (ch == '#' && !stack2.empty()) {
        		stack2.pop();
        	} else if (ch != '#') {
        		stack2.push(ch);
        	}
        }
        if (stack1.size() != stack2.size()) {
        	return false;
        }
        while (!stack1.empty()) {
        	if (!stack1.pop().equals(stack2.pop())) {
        		return false;
        	}
        }
    	return true;
    }
}
