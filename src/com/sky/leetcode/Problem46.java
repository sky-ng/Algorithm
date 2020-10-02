package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem46 {
    public List<List<Integer>> permute(int[] nums) {
    	int n = nums.length;
    	if (n == 0) return new ArrayList<>();
    	List<List<Integer>> ans = new LinkedList<>();
    	boolean[] used = new boolean[n];
    	dfs(ans, new ArrayList<>(), nums, used, n);
    	return ans;
    }
    

	private void dfs(List<List<Integer>> ans, List<Integer> list, int[] nums, boolean[] used, int n) {
    	if (n == 0) {
    		ans.add(list);
    	}
    	for (int i = 0; i < nums.length; ++i) {
    		if (!used[i]) {
    			List<Integer> l = new ArrayList<>(list);
    			l.add(nums[i]);
    			boolean[] used_temp = Arrays.copyOf(used, used.length);
    			used_temp[i] = true;
    			dfs(ans, l, nums, used_temp, n - 1);
    		}
    	}
    }
}
