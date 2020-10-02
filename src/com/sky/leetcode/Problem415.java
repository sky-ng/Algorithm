package com.sky.leetcode;

public class Problem415 {
    public String addStrings(String num1, String num2) {
    	char[] num1_arr = num1.toCharArray();
    	char[] num2_arr = num2.toCharArray();
    	StringBuilder sb = new StringBuilder();
    	int i = num1_arr.length - 1, j = num2_arr.length - 1;
    	boolean flag = false;
    	while (i >= 0 && j >= 0) {
    		int a = (num1_arr[i] - '0') + (num2_arr[j] - '0') + (flag ? 1 : 0);
    		flag = a >= 10;
    		a = a % 10;
    		sb.insert(0, a);
    		i--;
    		j--;
    	}
    	while (i >= 0) {
    		int a = (num1_arr[i] - '0') + (flag ? 1 : 0);
    		flag = a >= 10;
    		a = a % 10;
    		sb.insert(0, a);
    		i--;
    	}
    	while (j >= 0) {
    		int a = (num2_arr[j] - '0') + (flag ? 1 : 0);
    		flag = a >= 10;
    		a = a % 10;
    		sb.insert(0, a);
    		j--;
    	}
    	if (flag) {
    		sb.insert(0, 1);
    	}
    	return sb.toString();
    }
    
    public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.insert(0, 1);
		sb.insert(0, 2);
		sb.insert(0, 3);
		sb.insert(0, 4);
		System.out.println(sb.toString());
		
	}
}
