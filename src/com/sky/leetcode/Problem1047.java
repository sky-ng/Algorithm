package com.sky.leetcode;

import java.util.Stack;

public class Problem1047 {
    public String removeDuplicates(String S) {
        int strSize = S.length();
        Stack<Character> stack = new Stack<>();
        int stackSize = stack.size();
        for (int i = 0; i < strSize; i++) {
        	if (stackSize != 0) {
        		char temp = stack.peek();
        		if (S.charAt(i) == temp) {
        			stack.pop();
        			stackSize--;
        		} else {
        			stack.push(S.charAt(i));
        			stackSize++;
        		}
        	} else {
        		stack.push(S.charAt(i));
        		stackSize++;
        	}
        }
        StringBuilder strBuilder = new StringBuilder();
        while (!stack.empty()) {
        	strBuilder.append(stack.pop());
        }
        return strBuilder.reverse().toString();
    }
    
    public static void main(String[] args) {
		System.out.println(new Problem1047().removeDuplicates("abbaca"));
	}
}
