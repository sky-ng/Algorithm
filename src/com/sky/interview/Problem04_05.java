package com.sky.interview;

import java.util.Stack;

public class Problem04_05 {
	
    public boolean isValidBST2(TreeNode root) {
    	if (root == null) return true;
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode p = root;
    	long min = Long.MIN_VALUE;
    	while (p != null || !stack.isEmpty()) {
    		while (p != null) {
    			stack.push(p);
    			p = p.left;
    		}
    		p = stack.pop();
    		if (p.val <= min) {
    			return false;
    		} else {
    			min = p.val;
    		}
    		p = p.right;
    	}
    	return true;
    }
	
    public boolean isValidBST(TreeNode root) {
    	if (root == null) return true;
    	return ((root.left != null) ? root.left.val < root.val && findMax(root.left) < root.val : true)
    			&& ((root.right != null) ? root.right.val > root.val && findMin(root.right) > root.val : true)
    			&& isValidBST(root.left) 
    			&& isValidBST(root.right);
    }
    
    private int findMax(TreeNode node) {
    	TreeNode p = node;
    	while (p.right != null) {
    		p = p.right;
    	}
    	return p.val;
    }
    
    private int findMin(TreeNode node) {
    	TreeNode p = node;
    	while (p.left != null) {
    		p = p.left;
    	}
    	return p.val;
    }
}
