package com.sky.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
        	int size = queue.size();
        	List<Integer> list = new LinkedList<>();
        	while (size-- > 0) {
        		TreeNode curNode = queue.poll();
        		list.add(curNode.val);
        		if (curNode.left != null) {
        			queue.add(curNode.left);
        		}
        		if (curNode.right != null) {
        			queue.add(curNode.right);
        		}
        	}
        	res.add(list);
        }
    	return res;
    }
}
