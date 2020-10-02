package com.sky.interview;

public class Problem08_01 {
    public int waysToStep(int n) {
    	switch(n) {
    	case 1:
    		return 1;
    	case 2:
    		return 2;
    	case 3:
    		return 4;
    	default:
    		long[] arr = new long[n + 1];
    		arr[1] = 1;
    		arr[2] = 2;
    		arr[3] = 4;
    		for (int i = 4; i <= n; i++) {
    			arr[i] = (arr[i - 1] + arr[i - 2] + arr[i - 3]) % 1000000007;
    		}
    		return (int) arr[n];
    	}
    }
}
