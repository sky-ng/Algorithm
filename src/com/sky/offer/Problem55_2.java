package com.sky.offer;

public class Problem55_2 {
	
	private int height(TreeNode node) {
		if (node == null) return 0;
		else return 1 + Math.max(height(node.left), height(node.right));
	}
	
    public boolean isBalanced(TreeNode root) {
    	if (root == null) return true;
    	if (Math.abs(height(root.left) - height(root.right)) > 1) return false;
    	return isBalanced(root.left) && isBalanced(root.right);
    }
}
