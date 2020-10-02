package com.sky.leetcode;

public class Problem1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) return null;
        if (original.val == target.val) {
        	return cloned;
        }
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        TreeNode right = getTargetCopy(original.right, cloned.right, target);
        return left == null ? right : left;
    }
}
