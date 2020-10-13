package com.sky.leetcode;

public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode res = new ListNode(0);
    	ListNode cur = res;
    	boolean flag = false;
    	while (l1 != null && l2 != null) {
    		int sum = l1.val + l2.val + (flag ? 1 : 0);
    		ListNode node = new ListNode(sum % 10);
    		cur.next = node;
    		cur = cur.next;
    		flag = sum / 10 == 1;
    		l1 = l1.next;
    		l2 = l2.next;
    	}
    	while (l1 != null) {
    		int sum = l1.val + (flag ? 1 : 0);
    		ListNode node = new ListNode(sum % 10);
    		cur.next = node;
    		cur = cur.next;
    		flag = sum / 10 == 1;
    		l1 = l1.next;
    	}
    	while (l2 != null) {
    		int sum = l2.val + (flag ? 1 : 0);
    		ListNode node = new ListNode(sum % 10);
    		cur.next = node;
    		cur = cur.next;
    		flag = sum / 10 == 1;
    		l2 = l2.next;
    	}
    	if (flag) {
    		ListNode node = new ListNode(1);
    		cur.next = node;
    		cur = cur.next;
    	}
    	return res.next;
    }
}
