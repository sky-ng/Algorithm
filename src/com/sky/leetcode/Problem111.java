package com.sky.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem111 {
    public int minDepth(TreeNode root) {
    	if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
    	queue.add(root);
    	int depth = 0;
    	while (!queue.isEmpty()) {
    		int count = queue.size();
    		depth++;
    		while (count > 0) {
    			count--;
    			TreeNode currentNode = queue.poll();
    			if (currentNode.left == null && currentNode.right == null) {
    				return depth;
    			}
    			if (currentNode.left != null) {
    				queue.add(currentNode.left);
    			}
    			if (currentNode.right != null) {
    				queue.add(currentNode.right);
    			}
    		}
    	}
    	return depth;
    }
}
