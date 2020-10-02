package com.sky.leetcode;

public class Problem367 {
	
    public boolean isPerfectSquare(int num) {
    	int left = 1;
    	int right = num;
    	int middle = left + ((right - left) >> 1);
    	while (left <= right) {
    		long x = (long) middle * middle;
    		if (num == x) {
    			return true;
    		} else if (num < x) {
    			right = middle - 1;
    		} else {
    			left = middle + 1;
    		}
    		middle = left + ((right - left) >> 1);
    	}
        return false;
    }
    
    public static void main(String[] args) {
		System.out.println(new Problem367().isPerfectSquare(2147483647));
	}
}
