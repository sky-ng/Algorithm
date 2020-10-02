package com.sky.leetcode;

public class Problem476 {
	public static void main(String[] args) {
		System.out.println(new Problem476().findComplement(4));
	}
    public int findComplement(int num) {
        int temp = num;
        int c = 0;
        while (temp != 0) {
        	temp >>= 1;
        	c = (c << 1) + 1;
        }
        
    	return num ^ c;
    }
}
