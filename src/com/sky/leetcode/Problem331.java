package com.sky.leetcode;

public class Problem331 {
    public boolean isValidSerialization(String preorder) {
    	if ("".equals(preorder)) {
    		return false;
    	}
    	String[] nodes = preorder.split(",");
    	int stack = 0;
    	for (int i = 0; i < nodes.length; i++) {
    		if ("#".equals(nodes[i])) {
    			if (stack == 0) {
    				return i == nodes.length - 1;
    			} else {
    				stack--;
    			}
    		} else {
    			stack++;
    		}
    	}
    	return false;
    }
}
