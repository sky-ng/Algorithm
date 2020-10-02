package com.sky.leetcode;

public class Problem21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if (l1 == null) return l2;
    	if (l2 == null) return l1;
    	ListNode result = null;
    	ListNode p = null;
    	if (l1.val <= l2.val) {
    		result = l1;
    		p = result;
    		l1 = l1.next;
    	} else {
    		result = l2;
    		p = result;
    		l2 = l2.next;
    	}
    	while (l1 != null && l2 != null) {
    		if (l1.val <= l2.val) {
        		p.next = l1;
        		l1 = l1.next;
        		p = p.next;
        	} else {
        		p.next = l2;
        		l2 = l2.next;
        		p = p.next;
        	}
    	}
    	
    	if (l1 != null) {
    		p.next = l1;
    	}
    	
    	if (l2 != null) {
    		p.next = l2;
    	}
    	
        return result;
    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(4);
		l1.next = l3;
		l3.next = l5;
		l5.next = null;
		l2.next = l4;
		l4.next = l6;
		l6.next = null;
		ListNode res = new Problem21().mergeTwoLists(l1, l2);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
}
