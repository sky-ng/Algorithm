package com.sky.leetcode;

public class Problem129 {
	
	private int ans = 0;
	
    public int sumNumbers(TreeNode root) {
    	dfs(root, 0);
    	return ans;
    }

	private void dfs(TreeNode node, int pathSum) {
		if (node != null) {
			pathSum = 10 * pathSum + node.val;
		} else {
			return;
		}
		if (node.left == null && node.right == null) {
			ans += pathSum;
			return;
		}
		dfs(node.left, pathSum);
		dfs(node.right, pathSum);
	}
}
