package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, candidates, target, new ArrayList<>(), candidates.length - 1);
        return ans;
    }
    
    private void dfs(List<List<Integer>> ans, int[] candidates, int target, List<Integer> list, int index) {
    	if (target == 0) {
    		ans.add(list);
    		return;
    	}
    	for (int i = index; i >= 0; --i) {
    		if (candidates[i] <= target) {
    			List<Integer> l = new ArrayList<>(list);
    			l.add(candidates[i]);
    			dfs(ans, candidates, target - candidates[i], l, i);
    		}
    	}
    }
}
