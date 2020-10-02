package com.sky.leetcode;

public class Problem1281 {
    public int subtractProductAndSum(int n) {
    	int multi = 1, add = 0;
    	while (n != 0) {
    		int temp = n % 10;
    		n /= 10;
    		multi *= temp;
    		add += temp;
    	}
    	return multi - add;
    }
}
