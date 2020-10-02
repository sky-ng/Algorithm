package com.sky.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem429 {
	
    public List<List<Integer>> levelOrder(Node root) {
    	
        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
    		return result;
    	}
        queue.add(root);
        while (!queue.isEmpty()) {
        	int count = queue.size();
        	List<Integer> temp = new ArrayList<Integer>();
        	while (count > 0) {
        		count--;
        		Node currentNode = queue.poll();
        		temp.add(currentNode.val);
        		List<Node> children = currentNode.children;
        		for (Node child : children) {
        			if (child != null) {
        				queue.add(child);
        			}
        		}
        	}
        	result.add(temp);
        }
    	return result;
    }

}
