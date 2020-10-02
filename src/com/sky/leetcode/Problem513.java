package com.sky.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int ans = 0;
        while (!queue.isEmpty()) {
        	ans = queue.peek().val;
        	int count = queue.size();
        	while (count-- > 0) {
        		TreeNode currentNode = queue.poll();
        		if (currentNode.left != null) {
        			queue.add(currentNode.left);
        		}
        		if (currentNode.right != null) {
        			queue.add(currentNode.right);
        		}
        	}
        }
    	return ans;
    }
}
