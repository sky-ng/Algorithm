package com.sky.leetcode;

public class Problem12 {
	
	private int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
        	for (int i = 0; i < 13; ++i) {
        		if (num >= nums[i]) {
        			sb.append(symbol[i]);
        			num -= nums[i];
        			break;
        		}
        	}
        }
    	return sb.toString();
    }
}
