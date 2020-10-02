package com.sky.leetcode;

public class Problem441 {
    public int arrangeCoins(int n) {
        long count = 0;
        int addNum = 0;
        while (n >= count) {
        	count += (++addNum);
        }
    	return addNum - 1;
    }
    
    public static void main(String[] args) {
		System.out.println(new Problem441().arrangeCoins(2147483647));
	}
}
