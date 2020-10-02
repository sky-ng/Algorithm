package com.sky.leetcode;

import java.util.Stack;

public class Problem682 {
    public int calPoints(String[] ops) {
        int result = 0;
        Stack<String> stack = new Stack<>();
        int opsSize = ops.length;
        for (int i = 0; i < opsSize; i++) {
        	if ("C".equals(ops[i])) {
        		if (!stack.empty()) {
        			String temp = stack.pop();
        			result -= Integer.valueOf(temp);
        		}
        	} else if ("D".equals(ops[i])) {
        		if (!stack.empty()) {
        			String temp = stack.peek();
        			Integer addNum = 2*Integer.valueOf(temp);
        			result += addNum;
        			stack.push(addNum.toString());
        		}
        	} else if ("+".equals(ops[i])) {
        		if (stack.size() == 1) {
        			String temp = stack.peek();
        			Integer addNum = Integer.valueOf(temp);
        			result += addNum;
        			stack.push(addNum.toString());
        		} else if (stack.size() >= 2) {
        			String temp1 = stack.pop();
        			String temp2 = stack.pop();
        			stack.push(temp2);
        			stack.push(temp1);
        			Integer addNum1 = Integer.valueOf(temp1);
        			Integer addNum2 = Integer.valueOf(temp2);
        			result += (addNum1 + addNum2);
        			stack.push((addNum1+addNum2) + "");
        		}
        	} else {
        		stack.push(ops[i]);
        		result += Integer.valueOf(ops[i]);
        	}
        }
    	return result;
    }
    
    public static void main(String[] args) {
		String ops[] = {"5","-2","4","C","D","9","+","+"};
		System.out.println(new Problem682().calPoints(ops));
	}
}
