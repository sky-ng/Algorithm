package com.sky.leetcode;

import java.util.Stack;

public class Problem1038 {
    public TreeNode bstToGst(TreeNode root) {
    	if (root == null) return null;
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode p = root;
    	TreeNode res = root;
    	int cnt = 0;
    	while (p != null || !stack.isEmpty()) {
    		while (p != null) {
    			stack.push(p);
    			p = p.right;
    		}
    		p = stack.pop();
    		p.val += cnt;
    		cnt = p.val;
    		p = p.left;
    	}
    	return res;
    }
}
