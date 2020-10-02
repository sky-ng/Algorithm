package com.sky.leetcode;

import java.util.Arrays;

public class Problem106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	if (inorder == null || inorder.length == 0) {
    		return null;
    	}
    	TreeNode root = new TreeNode(postorder[postorder.length - 1]);
    	int index = helper(inorder, root.val);
    	int[] left_inorder = Arrays.copyOfRange(inorder, 0, index);
    	int[] right_inorder = Arrays.copyOfRange(inorder, index + 1, inorder.length);
    	int[] left_postorder = Arrays.copyOfRange(postorder, 0, index);
    	int[] right_postorder = Arrays.copyOfRange(postorder, index, inorder.length - 1);
    	TreeNode left = buildTree(left_inorder, left_postorder);
    	TreeNode right = buildTree(right_inorder, right_postorder);
    	root.left = left;
    	root.right = right;
    	return root;
    }
    
    private int helper(int[] inorder, int target) {
    	int len = inorder.length;
    	for (int i = 0; i < len; i++) {
    		if (inorder[i] == target) {
    			return i;
    		}
    	}
    	return -1;
    }
}
