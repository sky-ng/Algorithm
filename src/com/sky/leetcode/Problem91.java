package com.sky.leetcode;

import java.util.Arrays;

public class Problem91 {
	
	private int ans = 0;
	
    public int numDecodings(String s) {
    	dfs(s.toCharArray());
    	return ans;
    }
    
    private void dfs(char[] str) {
    	if (str.length == 0) {
    		++ans;
    		return;
    	}
    	if (str[0] == '0') {
    		return;
    	}
    	dfs(Arrays.copyOfRange(str, 1, str.length));
    	if (str.length >= 2 && Integer.valueOf(String.valueOf(Arrays.copyOfRange(str, 0, 2))) <= 26)
    		dfs(Arrays.copyOfRange(str, 2, str.length));
    }
    
    public static void main(String[] args) {
    	Problem91 p = new Problem91();
    	System.out.println(p.numDecodings("1787897759966261825913315262377298132516969578441236833255596967132573482281598412163216914566534565"));
	}
}
