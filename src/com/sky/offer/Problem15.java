package com.sky.offer;

public class Problem15 {
    public int hammingWeight(int n) {
        int res = 0;
        int flag = 32;
        while (flag-- != 0) {
        	if ((n & 1) == 1) {
        		res++;
        	}
        	n = n >> 1;
        }
        return res;
    }
}
