package com.sky.offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Problem32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	Deque<TreeNode> deque = new LinkedList<>();
    	List<List<Integer>> ans = new ArrayList<>();
    	if (root == null) return ans;
    	boolean flag = true;
    	deque.addFirst(root);
    	while (!deque.isEmpty()) {
    		int size = deque.size();
    		List<Integer> list = new ArrayList<>();
    		while (size-- > 0) {
    			if (flag) {
    				TreeNode node = deque.pollFirst();
    				if (node.left != null) {
    					deque.addLast(node.left);
    				}
    				if (node.right != null) {
    					deque.addLast(node.right);
    				}
    				list.add(node.val);
    			} else {
    				TreeNode node = deque.pollLast();
    				if (node.right != null) {
    					deque.addFirst(node.right);
    				}
    				if (node.left != null) {
    					deque.addFirst(node.left);
    				}
    				list.add(node.val);
    			}
    		}
    		flag = !flag;
    		ans.add(list);
    	}
    	
    	return ans;
    }
}
