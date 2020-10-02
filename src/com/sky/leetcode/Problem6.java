package com.sky.leetcode;

public class Problem6 {
	
	public String convert(String s, int numRows) {
        StringBuilder[] sb_arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
        	sb_arr[i] = new StringBuilder();
        }
        char[] str = s.toCharArray();
        int i = 0;
        while (i < str.length) {
        	for (int j = 0; j < numRows && i < str.length; ++j, ++i) {
        		sb_arr[j].append(str[i]);
        	}
        	for (int j = numRows - 2; j > 0 && i < str.length; --j, ++i) {
        		sb_arr[j].append(str[i]);
        	}
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : sb_arr) {
        	ans.append(sb);
        }
        return ans.toString();
    }
    
    public static void main(String[] args) {
    	Problem6 p = new Problem6();
    	System.out.println(p.convert("LEETCODEISHIRING", 4));
	}
}
