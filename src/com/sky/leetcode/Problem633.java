package com.sky.leetcode;

public class Problem633 {
    public boolean judgeSquareSum(int c) {
    	int left = 0, right = (int) Math.sqrt(c);
    	while (left <= right) {
    		if (left * left + right * right == c) {
    			return true;
    		} else if (left * left + right * right > c) {
    			right--;
    		} else {
    			left++;
    		}
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    	Problem633 p = new Problem633();
    	System.out.println(p.judgeSquareSum(2));
	}
}
