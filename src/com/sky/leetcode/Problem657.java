package com.sky.leetcode;

public class Problem657 {
    public boolean judgeCircle(String moves) {
    	int up = 0, right = 0;
    	for (char m : moves.toCharArray()) {
    		switch(m) {
    		case 'U':
    			++up;
    			break;
    		case 'D':
    			--up;
    			break;
    		case 'L':
    			--right;
    			break;
			default:
				++right;
				break;
    		}
    	}
    	return up == 0 && right == 0;
    }
}
