package com.sky.leetcode;

public class Problem24 {
    public ListNode swapPairs(ListNode head) {
    	ListNode blankNode = new ListNode(0);
    	ListNode p = head, q;
    	ListNode cur = blankNode;
    	while (p != null) {
    		q = p.next;
    		if (q == null) {
    			cur.next = p;
    			break;
    		}
    		else {
    			cur.next = q;
    			p.next = q.next;
    			q.next = p;
    			cur = p;
    			p = p.next;
    		}
    	}
    	return blankNode.next;
    }
}
