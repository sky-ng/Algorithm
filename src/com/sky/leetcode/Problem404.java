package com.sky.leetcode;

public class Problem404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
    	if (root.left != null && root.left.left == null && root.left.right == null) {
    		sum += root.left.val;
    	}
    	return sum + sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
    }
}
