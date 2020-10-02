package com.sky.offer;

import java.util.Stack;

public class Problem54 {
    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curNode = root;
        while (curNode != null || !stack.empty()) {
        	while (curNode != null) {
        		stack.push(curNode);
        		curNode = curNode.right;
        	}
        	curNode = stack.pop();
        	k--;
        	if (k == 0) {
        		return curNode.val;
        	}
        	curNode = curNode.left;
        }
        return 0;
    }
}
