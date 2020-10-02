package com.sky.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Problem589 {
	public static void main(String[] args) {
		
	}
	private List<Integer> list = new LinkedList<Integer>();
    public List<Integer> preorder(Node root) {
    	DFS(root);
        return list;
    }
    private void DFS(Node root) {
    	if (root == null) {
    		return;
    	} else {
    		list.add(root.val);
    		for (Node node:root.children) {
    			DFS(node);
    		}
    	}
    }
}