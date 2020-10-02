package com.sky.leetcode;

public class Problem687 {
	
	private int max = 0;
	
    public int longestUnivaluePath(TreeNode root) {
    	if (root == null) return 0;
    	TreeNode p = root;
    	//node左边最长路径+node右边最长路径
    	int left = p.left != null && p.left.val == p.val ? helper(p.left) : 0;
    	int right = p.right != null && p.right.val == p.val ? helper(p.right) : 0;
    	int temp = left + right;
    	if (temp > max) {
    		max = temp;
    	}
    	if (root.left != null) {
    		longestUnivaluePath(root.left);
    	}
    	if (root.right != null) {
    		longestUnivaluePath(root.right);
    	}
    	return max;
    }
    
    private int helper(TreeNode node) {
    	return 1 + Math.max(node.left != null && node.val == node.left.val ? helper(node.left) : 0,
    			node.right != null && node.val == node.right.val ? helper(node.right) : 0);
    }
}
