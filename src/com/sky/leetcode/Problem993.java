package com.sky.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Problem993 {
    public boolean isCousins(TreeNode root, int x, int y) {
    	if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        queue.add(root);
        map.put(root.val, null);
        boolean flag1 = false, flag2 = false;
        while (!queue.isEmpty()) {
        	int count = queue.size();
        	while (count > 0) {
        		count--;
        		TreeNode currentNode = queue.poll();
        		if (currentNode.val == x) {
        			flag1 = true;
        		}
        		if (currentNode.val == y) {
        			flag2 = true;
        		}
        		if (currentNode.left != null) {
        			queue.add(currentNode.left);
        			map.put(currentNode.left.val, currentNode.val);
        		}
        		if (currentNode.right != null) {
        			queue.add(currentNode.right);
        			map.put(currentNode.right.val, currentNode.val);
        		}
        	}
        	
        	if (flag1 && flag2 && map.get(x) != map.get(y)) {
        		return true;
        	}
        	flag1 = false;
        	flag2 = false;
        }
    	return false;
    }
}
