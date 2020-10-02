package com.sky.leetcode;

/**
 * 本题参考：https://blog.csdn.net/u013309870/article/details/70742315
 * @author SKY
 *
 */
public class Problem5 {
    public String longestPalindrome(String s) {
    	int len = s.length();
    	if (len < 1) return "";
    	char[] s_arr = s.toCharArray();
    	//初始值为首字母
    	String ans = s.substring(0, 1);
    	boolean[][] dp = new boolean[len][len];
    	dp[len - 1][len - 1] = true;
    	for (int i = len - 2; i >= 0; --i) {
    		dp[i][i] = true;
    		dp[i][i + 1] = s_arr[i] == s_arr[i + 1];
    		if (dp[i][i + 1] && ans.length() <= 1) {
    			ans = s.substring(i, i + 2);
    		}
    		for (int j = i + 2; j < len; ++j) {
    			dp[i][j] = dp[i + 1][j - 1] && s_arr[i] == s_arr[j];
        		if (dp[i][j] && ans.length() <= j - i) {
        			ans = s.substring(i, j + 1);
        		}
    		}
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
    	Problem5 p =new Problem5();
    	p.longestPalindrome("a");
	}
}
