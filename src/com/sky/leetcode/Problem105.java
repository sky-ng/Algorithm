package com.sky.leetcode;

import java.util.Arrays;

public class Problem105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if (preorder == null || preorder.length == 0) {
    		return null;
    	}
    	TreeNode root = new TreeNode(preorder[0]);
    	int index = helper(inorder, preorder[0]);
    	int[] left_inorder = Arrays.copyOfRange(inorder, 0, index);
    	int[] right_inorder = Arrays.copyOfRange(inorder, index + 1, preorder.length);
    	int[] left_preorder = Arrays.copyOfRange(preorder, 1, 1 + index);
    	int[] right_preorder = Arrays.copyOfRange(preorder, 1 + index, preorder.length);
    	root.left = buildTree(left_preorder, left_inorder);
    	root.right = buildTree(right_preorder, right_inorder);
    	return root;
    }
    
    private int helper(int[] inorder, int target) {
    	int len = inorder.length;
    	for (int i = 0; i < len; i++) {
    		if (target == inorder[i]) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] left_inorder = Arrays.copyOfRange(arr, 2, 5);
		System.out.println(Arrays.toString(left_inorder));
	}
}
