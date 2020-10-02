package com.sky.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> ans = new LinkedList<>();
    	if (root == null) return ans;
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.add(root);
    	while (!queue.isEmpty()) {
    		int size = queue.size();
    		List<Integer> list = new LinkedList<>();
    		while (size-- > 0) {
    			TreeNode node = queue.poll();
    			list.add(node.val);
    			if (node.left != null)
    				queue.add(node.left);
    			if (node.right != null)
    				queue.add(node.right);
    		}
    		ans.add(0, list);
    	}
    	return ans;
    }
}
