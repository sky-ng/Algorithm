package com.sky.leetcode;

public class Problem24 {
    public ListNode swapPairs(ListNode head) {
    	if (head == null) return null;
    	if (head.next == null) return head;
        ListNode blank_node = new ListNode(0);
        blank_node.next = head;
        ListNode p = blank_node, q = head.next;
        while (q != null) {
        	p.next.next = q.next;
        	q.next = p.next;
        	p.next = q;
        	q = q.next;
        	int cnt = 2;
        	while (q != null && cnt-- > 0) {
        		p = p.next;
        		q = q.next;
        	}
        }
        return blank_node.next;
    }
}
