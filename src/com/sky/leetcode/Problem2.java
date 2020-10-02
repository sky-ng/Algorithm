package com.sky.leetcode;

public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	boolean flag = false;
    	
    	ListNode res = new ListNode(0);
    	ListNode cur = res;
    	
    	while (l1 != null && l2 != null) {
    		ListNode node = new ListNode((l1.val + l2.val + (flag ? 1 : 0)) % 10);
    		flag = l1.val + l2.val + (flag ? 1 : 0) >= 10 ? true : false;
    		cur.next = node;
    		cur = node;
    		l1 = l1.next;
    		l2 = l2.next;
    	}
    	while (l1 != null) {
    		ListNode node = new ListNode((l1.val + (flag ? 1 : 0)) % 10);
    		flag = l1.val + (flag ? 1 : 0) >= 10 ? true : false;
    		cur.next = node;
    		cur = node;
    		l1 = l1.next;
    	}
    	while (l2 != null) {
    		ListNode node = new ListNode((l2.val + (flag ? 1 : 0)) % 10);
    		flag = l2.val + (flag ? 1 : 0) >= 10 ? true : false;
    		cur.next = node;
    		cur = node;
    		l2 = l2.next;
    	}
    	if (flag) {
    		ListNode node = new ListNode(1);
    		cur.next = node;
    	}
    	return res.next;
    }
}
