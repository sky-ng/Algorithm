package com.sky.leetcode;

public class Problem124 {
	
	private int ans = -0x3f3f3f3f;
	
    public int maxPathSum(TreeNode root) {
    	if (root == null) return 0;
    	dfs(root);
    	return ans;
    }
    
    private int dfs(TreeNode root) {
    	if (root == null) return 0;
    	int left = dfs(root.left);
    	int right = dfs(root.right);
    	ans = Math.max(ans, root.val + Math.max(0, Math.max(Math.max(left, right), left + right)));
    	return Math.max(root.val, root.val + Math.max(left, right));
    }
}
