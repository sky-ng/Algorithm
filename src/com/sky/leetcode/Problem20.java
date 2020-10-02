package com.sky.leetcode;

import java.util.Stack;

public class Problem20 {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
        	switch (ch) {
        	case '(':stack.push(')');break;
        	case '[':stack.push(']');break;
        	case '{':stack.push('}');break;
        	case ')':
        		if (stack.empty()) {
        			return false;
        		} else {
        			if (stack.pop() != ')') {
        				return false;
        			}
        		}
        		break;
        	case ']':
        		if (stack.empty()) {
        			return false;
        		} else {
        			if (stack.pop() != ']') {
        				return false;
        			}
        		}
        		break;
        	case '}':
        		if (stack.empty()) {
        			return false;
        		} else {
        			if (stack.pop() != '}') {
        				return false;
        			}
        		}
        		break;
        	}
        }
        return stack.empty() ? true : false;
    }
}
