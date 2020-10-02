package com.sky.leetcode;

public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if (head == null) return null;
    	ListNode blank_node = new ListNode(0);
    	blank_node.next = head;
    	ListNode p = blank_node, q = blank_node, before_q = blank_node;
    	while (n-- > 0) {
    		p = p.next;
    	}
    	while (p != null) {
    		p = p.next;
    		before_q = q;
    		q = q.next;
    	}
    	before_q.next = q.next;
    	return blank_node.next;
    }
}
