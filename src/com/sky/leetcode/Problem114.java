package com.sky.leetcode;

import java.util.Stack;

public class Problem114 {
    public void flatten(TreeNode root) {
    	if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode lastNode = null;
        while (!stack.isEmpty()) {
    		TreeNode currentNode = stack.pop();
    		if (lastNode != null) {
    			lastNode.left = null;
    			lastNode.right = currentNode;
    		}
    		lastNode = currentNode;
    		if (currentNode.right != null) {
    			stack.push(currentNode.right);
    		}
    		if (currentNode.left != null) {
    			stack.push(currentNode.left);
    		}
        }
    }
}
