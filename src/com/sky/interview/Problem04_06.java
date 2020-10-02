package com.sky.interview;

import java.util.Stack;

public class Problem04_06 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    	if (root == null || p == null) return null;
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode cur = root;
    	boolean flag = false;
    	while (cur != null || !stack.isEmpty()) {
    		while (cur != null) {
    			stack.push(cur);
    			cur = cur.left;
    		}
    		cur = stack.pop();
    		if (flag) {
    			return cur;
    		}
    		if (cur.val == p.val) {
    			flag = true;
    		}
    		cur = cur.right;
    	}
    	return null;
    }
}
