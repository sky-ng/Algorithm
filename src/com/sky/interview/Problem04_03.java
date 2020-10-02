package com.sky.interview;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem04_03 {
    public ListNode[] listOfDepth(TreeNode tree) {
    	if (tree == null) return new ListNode[0];
    	List<ListNode> list = new LinkedList<>();
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.add(tree);
    	while (!queue.isEmpty()) {
    		int size = queue.size();
    		ListNode head = new ListNode(0);
    		ListNode p = head;
    		while (size-- > 0) {
    			TreeNode node = queue.poll();
    			p.next = new ListNode(node.val);
    			p = p.next;
    			if (node.left != null) {
    				queue.add(node.left);
    			}
    			if (node.right != null) {
    				queue.add(node.right);
    			}
    		}
    		list.add(head.next);
    	}
    	ListNode[] res = new ListNode[list.size()];
    	for (int i = 0; i < res.length; i++) {
    		res[i] = list.get(i);
    	}
    	return res;
    }
}
