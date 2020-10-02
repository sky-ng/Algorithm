package com.sky.offer;

import java.util.LinkedList;
import java.util.Queue;

public class Problem55_1 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int res = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
        	int size = queue.size();
        	res++;
        	while (size-- > 0) {
            	TreeNode node = queue.poll();
            	if (node.left != null) {
            		queue.add(node.left);
            	}
            	if (node.right != null) {
            		queue.add(node.right);
            	}
        	}
        }
        
        return res;
    }
}
