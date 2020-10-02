package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	Set<List<Integer>> ans = new HashSet<>();
    	dfs(ans, candidates, target, new ArrayList<>(), candidates.length - 1);
    	List<List<Integer>> finalAns = new ArrayList<>();
    	for (List<Integer> l : ans) {
    		finalAns.add(l);
    	}
    	return finalAns;
    }
    
    private void dfs(Set<List<Integer>> ans, int[] candidates, int target, List<Integer> list, int index) {
    	if (target == 0) {
    		ans.add(list);
    		return;
    	}
    	for (int i = index; i >= 0; --i) {
    		if (target >= candidates[i]) {
    			List<Integer> l = new ArrayList<>(list);
    			l.add(candidates[i]);
    			dfs(ans, candidates, target - candidates[i], l, i - 1);
    		}
    	}
    }
    
    public static void main(String[] args) {
    	Problem40 p = new Problem40();
    	int[] candidates = {10,1,2,7,6,1,5};
    	int target = 8;
    	System.out.println(p.combinationSum2(candidates, target));
	}
}
