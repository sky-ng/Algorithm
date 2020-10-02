package com.sky.leetcode;

public class Problem788 {
    public int rotatedDigits(int N) {
    	int cnt = 0;
        for (int i = 2; i <= N; i++) {
        	if (isGoodNumber(i)) {
        		cnt++;
        	}
        }
        
        return cnt;
    }
    
    public boolean isGoodNumber(int x) {
    	String s = String.valueOf(x);
    	if (s.contains("3") || s.contains("4") || s.contains("7")) {
    		return false;
    	}
    	if (s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")) {
    		return true;
    	}
    	return false;
    }
}
