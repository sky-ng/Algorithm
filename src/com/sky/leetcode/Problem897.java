package com.sky.leetcode;

import java.util.Stack;

public class Problem897 {
	private Stack<TreeNode> stack = new Stack<>();
    public TreeNode increasingBST(TreeNode root) {
    	if (root == null) return null;
    	helper(root);
    	TreeNode temp = null;
    	while (!stack.isEmpty()) {
    		TreeNode currentNode = stack.pop();
    		currentNode.left = null;
    		currentNode.right = temp;
    		temp = currentNode;
    	}
    	return temp;
    }
    private void helper(TreeNode root) {
    	if (root == null) return;
    	helper(root.left);
    	stack.add(root);
    	helper(root.right);
    }
}
