package com.sky.leetcode;

public class Problem43 {
    public String multiply(String num1, String num2) {
    	if ("0".equals(num1) || "0".equals(num2)) {
    		return "0";
    	}
    	int n1 = num1.length(), n2 = num2.length();
    	char[] num1_str = num1.toCharArray();
    	char[] num2_str = num2.toCharArray();
    	int[][] arr = new int[n2][n1 + 1];
    	int row = 0;
    	int cnt = 0;
    	for (int i = n2 - 1; i >= 0; --i) {
    		//表示进位
    		cnt = 0;
    		for (int j = n1 - 1; j >= 0; --j) {
    			int i_num1 = num1_str[j] - '0';
    			int i_num2 = num2_str[i] - '0';
    			arr[row][j + 1] = (i_num1 * i_num2 + cnt) % 10;
//    			System.out.println(arr[row][j + 1]);
    			cnt = (i_num1 * i_num2 + cnt) / 10;
    		}
    		arr[row][0] = cnt;
//    		System.out.println(arr[row][0]);
    		++row;
    	}
    	int[] ans = new int[n1 + n2];
    	row = 0;
    	cnt = 0;
    	for (int i = n1 + n2 - 1; i >= n1; --i) {
    		for (int j = i; j >= i - n1; --j) {
    			int temp = ans[j];
    			ans[j] = (ans[j] + arr[row][j - n2] + cnt) % 10;
    			cnt = (temp + arr[row][j]) / 10;
    		}
    		++row;
    	}
    	StringBuilder sb = new StringBuilder();
    	for (int i : ans) {
    		sb.append(i);
    	}
    	return sb.toString();
    }
    
    public static void main(String[] args) {
    	Problem43 p = new Problem43();
    	p.multiply("999", "99");
	}
}
