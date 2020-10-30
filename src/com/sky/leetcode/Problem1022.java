package com.sky.leetcode;

public class Problem1022 {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int pathSum) {
    	if (node == null) return 0;
    	int sum = (pathSum << 1) + node.val;
    	if (node.left == null && node.right == null) {
    		return sum;
    	} else {
    		return dfs(node.left, sum) + dfs(node.right, sum);
    	}
    }
}
