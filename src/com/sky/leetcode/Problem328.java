package com.sky.leetcode;

public class Problem328 {
    public ListNode oddEvenList(ListNode head) {
    	if (head == null) return null;
    	ListNode p = new ListNode(0);
    	ListNode q = new ListNode(0);
    	ListNode blank = new ListNode(0);
    	blank.next = head;
    	ListNode cur = head, cur_p = p, cur_q = q;
    	while (cur != null) {
    		if (cur != null) {
    			blank.next = cur.next;
    			cur_p.next = cur;
    			cur.next = null;
    			cur_p = cur_p.next;
    			cur = blank.next;
    		}
    		if (cur != null) {
    			blank.next = cur.next;
    			cur_q.next = cur;
    			cur.next = null;
    			cur_q = cur_q.next;
    			cur = blank.next;
    		}
    	}
    	cur_p.next = q.next;
    	return p.next;
    }
    
    public static void main(String[] args) {
    	Problem328 p = new Problem328();
    	ListNode n1 = new ListNode(1);
    	ListNode n2 = new ListNode(2);
    	ListNode n3 = new ListNode(3);
    	ListNode n4 = new ListNode(4);
    	ListNode n5 = new ListNode(5);
    	n1.next = n2;
    	n2.next = n3;
    	n3.next = n4;
    	n4.next = n5;
//    	n1.next = n2;
    	
    	ListNode c = p.oddEvenList(n1);
    	while (c != null) {
    		System.out.println(c.val);
    		c = c.next;
    	}
	}
}
