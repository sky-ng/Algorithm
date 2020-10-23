package com.sky.leetcode;

public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode blankNode = new ListNode(0);
    	blankNode.next = head;
    	ListNode p = blankNode, q = blankNode;
    	while (n-- > 0) q = q.next;
    	while (q.next != null) {
    		p = p.next;
    		q = q.next;
    	}
    	p.next = p.next.next;
    	return blankNode.next;
    }
}
