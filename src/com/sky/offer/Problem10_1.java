package com.sky.offer;

public class Problem10_1 {
    public int fib(int n) {
    	if (n == 0) return 0;
    	else if (n == 1) return 1;
    	else {
    		long a = 0;
    		long b = 1;
    		long res = 0;
    		for (int i = 2; i <= n; i++) {
    			res = (a + b) % 1000000007;
    			a = b;
    			b = res;
    		}
    		return (int) res;
    	}
    }
}
