package com.sky.leetcode;

import java.util.Stack;

public class Problem394 {
    public String decodeString(String s) {
        Stack<Integer> num_stack = new Stack<>();
        Stack<String> str_stack = new Stack<>();
        int num = 0;
        StringBuilder sb = new StringBuilder();
        char[] chs = s.toCharArray();
        for (char c : chs) {
        	if (c >= '0' && c <= '9') {
        		num = 10 * num + (c - '0');
        	} else if (c == '[') {
        		num_stack.push(num);
        		str_stack.push(sb.toString());
        		num = 0;
        		sb.delete(0, sb.length());
        	} else if (c == ']') {
        		StringBuilder last_str = new StringBuilder(str_stack.pop());
        		Integer cur_num = num_stack.pop();
        		for (int i = 0; i < cur_num; i++) {
        			last_str.append(sb);
        		}
        		sb = new StringBuilder(last_str);
        	} else {
        		sb.append(c);
        	}
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
    	Problem394 p = new Problem394();
    	String s = "2[abc]3[cd]ef";
    	System.out.println(p.decodeString(s));
	}
}
