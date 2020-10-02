package com.sky.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Problem872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    	List<Integer> leaf1 = new LinkedList<>();
    	List<Integer> leaf2 = new LinkedList<>();
    	findAllLeaves(root1, leaf1);
    	findAllLeaves(root2, leaf2);
    	return leaf1.equals(leaf2);
    }
    private void findAllLeaves(TreeNode root, List<Integer> leaf) {
    	Stack<TreeNode> stack = new Stack<>();
    	stack.add(root);
    	while (!stack.empty()) {
    		TreeNode currentNode = stack.pop();
    		if (currentNode.left == null && currentNode.right == null) {
    			leaf.add(currentNode.val);
    		}
    		if (currentNode.right != null) {
    			stack.push(currentNode.right);
    		}
    		if (currentNode.left != null) {
    			stack.push(currentNode.left);
    		}
    	}
    }
}
