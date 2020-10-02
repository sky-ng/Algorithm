package com.sky.interview;

public class Problem04_04 {
    public boolean isBalanced(TreeNode root) {
    	if (root == null) return true;
    	return Math.abs(helper(root.left) - helper(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int helper(TreeNode node) {
    	if (node == null)
    		return 0;
    	return Math.max(helper(node.left), helper(node.right)) + 1;
    }
}
