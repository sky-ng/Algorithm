package com.sky.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem08_08 {
	
	//存放所有可能的排列组合
	private List<String> list = new ArrayList<>();
	
    public String[] permutation(String S) {
    	char[] str = S.toCharArray();
    	Arrays.sort(str);
    	int n = str.length;
    	boolean[] used = new boolean[n];
    	dfs(str, 0, n, used, "");
    	return list.toArray(new String[0]);
    }
    
    private void dfs(char[] str, int cnt, int n, boolean[] used, String s) {
    	if (cnt == n) {
    		list.add(s);
    		return;
    	}
    	for (int i = 0; i < n; ++i) {
    		if (!used[i]) {
    			if (i > 0 && str[i] == str[i - 1] && !used[i - 1]) continue;
    			used[i] = true;
    			dfs(str, cnt + 1, n, used, s + str[i]);
    			used[i] = false;
    		}
    	}
    }
    
    public static void main(String[] args) {
    	Problem08_08 p = new Problem08_08();
    	System.out.println(Arrays.toString(p.permutation("qqe")));
	}
}
