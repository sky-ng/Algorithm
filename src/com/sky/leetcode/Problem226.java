package com.sky.leetcode;

public class Problem226 {
    public TreeNode invertTree(TreeNode root) {
    	dfs(root);
    	return root;
    }
    
    private void dfs(TreeNode root) {
    	if (root == null) return;
    	TreeNode temp = root.left;
    	root.left = root.right;
    	root.right = temp;
    	dfs(root.left);
    	dfs(root.right);
    }
}
