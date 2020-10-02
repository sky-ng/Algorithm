package com.sky.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem559 {
	
	public int maxDepth2(Node root) {
		if (root == null) {
			return 0;
		}
		int maxDepth = 0;
		for (Node child : root.children) {
			if (child != null) {
				int depth = maxDepth2(child);
				maxDepth = Math.max(maxDepth, depth);
			}
		}
		return maxDepth + 1;
	}
	
	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		Queue<Node> queue = new LinkedList<Node>();
		int maxDepth = 0;
		queue.add(root);
		while (!queue.isEmpty()) {
			maxDepth++;
			int count = queue.size();
			while (count > 0) {
				count--;
				Node currentNode = queue.poll();
				List<Node> children = currentNode.children;
				for (Node child : children) {
					if (child != null) {
						queue.add(child);
					}
				}
			}
		}
		return maxDepth;
	}

}
