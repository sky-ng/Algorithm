package com.sky.offer;

public class Problem24 {
	
	private ListNode firstNode;
	private ListNode curNode;
	
	private void helper(ListNode node) {
		if (node.next != null) {
			helper(node.next);
			curNode.next = node;
			curNode = node;
		} else {
			firstNode = node;
			curNode = node;
		}
	}
	
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        helper(head);
        curNode.next = null;
    	return firstNode;
    }
}
