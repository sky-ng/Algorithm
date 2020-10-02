package com.sky.leetcode;

import java.util.LinkedList;

public class Problem402 {
	
    public String removeKdigits(String num, int k) {
    	
    	LinkedList<Character> list = new LinkedList<>();
    	for (char c : num.toCharArray()) {
    		//以下代码适用于非单调递增数字序列
    		while (k > 0 && list.size() > 0 && list.peekLast() > c) {
    			list.removeLast();
    			k--;
    		}
    		list.addLast(c);
    	}
    	
    	//以下代码适用于单调递增数字序列，如123456
    	for (int i =0; i < k; i++) {
    		list.removeLast();
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	boolean isLeadingZero = true;
    	for (char c : list) {
    		if (isLeadingZero && c == '0') {
    			continue;
    		}
    		isLeadingZero = false;
    		sb.append(c);
    	}
    	return sb.length() == 0 ? "0" : sb.toString();
    }
    
}
