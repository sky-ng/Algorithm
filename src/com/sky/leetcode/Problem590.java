package com.sky.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Problem590 {
	public static void main(String[] args) {
		
	}
	private List<Integer> res = new LinkedList<>();
	public List<Integer> postorder(Node root) {
		if (root == null) {
			return null;
		}
		DFS(root);
		return res;
    }
	private void DFS(Node root) {
		if (root == null) {
			return;
		} else {
			for (Node node:root.children) {
				DFS(node);
			}
			res.add(root.val);
		}
	}
}

