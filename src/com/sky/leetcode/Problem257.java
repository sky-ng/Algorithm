package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem257 {
	
	private List<String> list = new ArrayList<>();
	
    public List<String> binaryTreePaths(TreeNode root) {
    	if (root == null) return new ArrayList<>();
    	
    	dfs(root, "" + root.val);
    	return list;
    }

	private void dfs(TreeNode root, String s) {
		if (root.left == null && root.right == null) {
			list.add(s);
			return;
		}
		if (root.left != null) {
			dfs(root.left, s + "->" + root.left.val);
		}
		if (root.right != null) {
			dfs(root.right, s + "->" + root.right.val);
		}
	}

}
