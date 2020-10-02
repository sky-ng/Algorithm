package com.sky.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem47 {
	
	private boolean[] visited;
	
    public List<List<Integer>> permuteUnique(int[] nums) {
    	List<List<Integer>> ans = new ArrayList<>();
    	if (nums == null || nums.length == 0) return ans;
    	int n = nums.length;
    	visited = new boolean[n];	//是否被访问过，初始化
    	List<Integer> list =  new ArrayList<>();
    	dfs(nums, ans, list, 0, n);
    	return ans;
    }

	private void dfs(int[] nums, List<List<Integer>> ans, List<Integer> list, int depth, int n) {
		if (depth == n) {
			ans.add(list);
			return;
		}
		Set<Integer> used = new HashSet<>();
		for (int i = 0; i < n; ++i) {
			if (!used.contains(nums[i]) && !visited[i]) {
				used.add(nums[i]);
				visited[i] = true;
				List<Integer> newList = new ArrayList<>(list);
				newList.add(nums[i]);
				dfs(nums, ans, newList, depth + 1, n);
				visited[i] = false;
			}
		}
	}
}
