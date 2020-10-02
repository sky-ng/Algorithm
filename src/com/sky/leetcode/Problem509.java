package com.sky.leetcode;

public class Problem509 {
    public int fib(int N) {
    	if (N == 0) return 0;
    	else if (N == 1) return 1;
    	else {
    		int a = 0, b = 1;
    		int ans = 0;
    		for (int i = 2; i <= N; ++i) {
    			ans = a + b;
    			a = b;
    			b = ans;
    		}
    		return ans;
    	}
    }
}
