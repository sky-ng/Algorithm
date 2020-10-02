package com.sky.leetcode;

public class Problem701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        dfs(root, val);
        return root;
    }

	private void dfs(TreeNode root, int val) {
		if (root.left == null && val < root.val) {
			TreeNode node = new TreeNode(val);
			root.left = node;
			return;
		}
		if (root.right == null && val > root.val) {
			TreeNode node = new TreeNode(val);
			root.right = node;
			return;
		}
		if (val > root.val) {
			dfs(root.right, val);
		} else {
			dfs(root.left, val);
		}
	}
    
}
