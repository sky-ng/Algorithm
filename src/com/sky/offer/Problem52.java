package com.sky.offer;

public class Problem52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p != null && q != null) {
        	p = p.next;
        	q = q.next;
        }
        if (p == null) {
        	p = headB;
        	while (q != null) {
        		p = p.next;
        		q = q.next;
        	}
        	q = headA;
        } else {
        	q = headA;
        	while (p != null) {
        		p = p.next;
        		q = q.next;
        	}
        	p = headB;
        }
    	while (p != q) {
    		p = p.next;
    		q = q.next;
    	}
        return p;
    }
}
