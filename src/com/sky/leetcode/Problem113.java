package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem113 {
	
	List<List<Integer>> ans;
	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	ans = new ArrayList<>();
    	if (root == null) return ans;
    	List<Integer> list = new ArrayList<>();
    	list.add(root.val);
    	dfs(root, sum, root.val, list);
    	return ans;
    }
    
    private void dfs(TreeNode root, int sum, int val, List<Integer> list) {
    	if (sum == val && root.left == null && root.right == null) {
    		ans.add(list);
    		return;
    	}
    	if (root.left != null) {
    		List<Integer> temp = new ArrayList<>(list);
    		temp.add(root.left.val);
    		dfs(root.left, sum, val + root.left.val, temp);
    	}
    	if (root.right != null) {
    		List<Integer> temp = new ArrayList<>(list);
    		temp.add(root.right.val);
    		dfs(root.right, sum, val + root.right.val, temp);
    	}
    }
}
