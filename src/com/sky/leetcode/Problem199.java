package com.sky.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem199 {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
        	return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
        	int count = queue.size();
        	TreeNode currentNode = null;
        	while (count > 0) {
        		count--;
        		currentNode = queue.poll();
        		if (currentNode.left != null) {
        			queue.add(currentNode.left);
        		}
        		if (currentNode.right != null) {
        			queue.add(currentNode.right);
        		}
        	}
        	ans.add(currentNode.val);
        }
    	return ans;
    }
}
