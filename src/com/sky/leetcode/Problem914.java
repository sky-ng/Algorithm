package com.sky.leetcode;

public class Problem914 {
    public boolean hasGroupsSizeX(int[] deck) {
    	int[] arr = new int[10000];
    	for (int d : deck) {
    		++arr[d];
    	}
    	int x = 0;
    	for (int a : arr) {
    		if (a > 0) {
    			x = gcd(x, a);
    			if (x < 2) return false;
    		}
    	}
    	return true;
    }
    
    private int gcd(int a, int b) {
    	if (a % b == 0) {
    		return b;
    	} else {
    		return gcd(b, a % b);
    	}
    }
}
