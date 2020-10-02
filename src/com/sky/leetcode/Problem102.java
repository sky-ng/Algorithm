package com.sky.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<>();
    	if (root == null) return result;
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.add(root);
    	while (!queue.isEmpty()) {
    		int count = queue.size();
    		List<Integer> temp = new ArrayList<Integer>();
    		while (count > 0) {
    			count--;
    			TreeNode currentNode = queue.poll();
    			temp.add(currentNode.val);
    			if (currentNode.left != null) {
    				queue.add(currentNode.left);
    			}
    			
    			if (currentNode.right != null) {
    				queue.add(currentNode.right);
    			}
    		}
    		result.add(temp);
    	}
        return result;
    }
}
