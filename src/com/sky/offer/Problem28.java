package com.sky.offer;

public class Problem28 {
    public boolean isSymmetric(TreeNode root) {
    	return isMirror(root, root);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right) {
    	if (left == null && right == null) return true;
    	if (left == null || right == null) return false;
    	return left.val == right.val && 
    			isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
