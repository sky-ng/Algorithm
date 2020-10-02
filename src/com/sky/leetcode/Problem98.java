package com.sky.leetcode;

import java.util.Stack;

public class Problem98 {
    public boolean isValidBST(TreeNode root) {
    	if (root == null) {
    		return true;
    	}
    	double k = - Double.MAX_VALUE;
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode cur = root;
    	while (cur != null || !stack.empty()) {
    		while (cur != null) {
    			stack.push(cur);
    			cur = cur.left;
    		}
    		cur = stack.pop();
    		if (cur.val <= k) {
    			return false;
    		}
    		k = cur.val;
    		cur = cur.right;
    	}
    	return true;
    }
}
