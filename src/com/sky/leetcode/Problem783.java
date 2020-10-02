package com.sky.leetcode;

public class Problem783 {
	
	private TreeNode pre;
	private int min = Integer.MAX_VALUE;
	
    public int minDiffInBST(TreeNode root) {
    	inorder(root);
    	return min;
    }
    
    private void inorder(TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	inorder(root.left);
    	if (pre != null) {
    		min = Math.min(min, root.val - pre.val);
    	}
    	pre = root;
    	inorder(root.right);
    }
}
