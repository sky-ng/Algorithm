package com.sky.leetcode;

public class Problem38 {
	
	private String helper(String formmer) {
		char[] str = formmer.toCharArray();
		int num = 1;
		char ch = str[0];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < str.length; i++) {
			if (str[i] == str[i - 1]) {
				num++;
			} else {
				sb.append(num);
				sb.append(ch);
				ch = str[i];
				num = 1;
			}
		}
		sb.append(num);
		sb.append(ch);
		return sb.toString();
	}
	
    public String countAndSay(int n) {
    	String[] dp = new String[n];
    	dp[0] = "1";
    	for (int i = 1; i < n; i++) {
    		dp[i] = helper(dp[i - 1]);
    	}
    	return dp[n - 1];
    }
}
