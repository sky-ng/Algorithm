package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem94 {
	
	private void helper(TreeNode node, List<Integer> list) {
		if (node != null) {
			if (node.left != null) {
				helper(node.left, list);
			}
			list.add(node.val);
			if (node.right != null) {
				helper(node.right, list);
			}
		}
	}
	
    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
        	while (cur != null) {
        		stack.push(cur);
            	cur = cur.left;
        	}
        	cur = stack.pop();
        	res.add(cur.val);
        	cur = cur.right;
        }
        return res;
    }
}
