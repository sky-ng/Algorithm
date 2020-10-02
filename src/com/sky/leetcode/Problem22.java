package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {
    public List<String> generateParenthesis(int n) {
    	List<String> ans = new ArrayList<>();
    	if (n <= 0) return ans;
    	dfs("", n, n, ans);
    	return ans;
    }
    
    private void dfs(String cur, int left, int right, List<String> ans) {
    	if (left == 0 && right == 0) {
    		ans.add(cur);
    		return;
    	}
    	if (left < 0 || left > right) return;
    	if (left > 0) {
    		dfs(cur + "(", left - 1, right, ans);
    	}
    	if (right > 0) {
    		dfs(cur + ")", left, right - 1, ans);
    	}
    }
}
