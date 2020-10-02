package com.sky.leetcode;

public class Problem543 {
	
	private int ans = -1;
	
    public int diameterOfBinaryTree(TreeNode root) {
    	if (root == null) return 0;
    	dfs(root);
    	return ans;
    }
    
    private int dfs(TreeNode root) {
    	if (root == null) return -1;
    	int left = dfs(root.left);
    	int right = dfs(root.right);
    	int maxLen = 2 + left + right;
    	ans = Math.max(ans, maxLen);
    	return 1 + Math.max(left, right);
    }
}
