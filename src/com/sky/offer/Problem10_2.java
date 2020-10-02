package com.sky.offer;

public class Problem10_2 {
    public int numWays(int n) {
    	int a = 1, b = 1;
    	int c;
    	for (int i = 0; i < n; i++) {
    		c = (a + b) % 1000000007;
    		a = b;
    		b = c;
    	}
    	return a;
    }
}
