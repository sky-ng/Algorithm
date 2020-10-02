package com.sky.interview;

public class Problem02_04 {
    public ListNode partition(ListNode head, int x) {
    	ListNode p = head, q = head;
    	while (q != null) {
    		if (q.val < x) {
    			int temp = p.val;
    			p.val = q.val;
    			q.val = temp;
    			p = p.next;
    		}
    		q = q.next;
    	}
    	return head;
    }
}
