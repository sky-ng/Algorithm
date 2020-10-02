package com.sky.leetcode;

public class Problem965 {
	
    public boolean isUnivalTree(TreeNode root) {
    	boolean left_flag = (root.left == null || 
    			(root.val == root.left.val && isUnivalTree(root.left)));
    	boolean right_flag = (root.right == null ||
    			(root.val == root.right.val && isUnivalTree(root.right)));
    	return left_flag && right_flag;
    }

}
