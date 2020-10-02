package com.sky.interview;

public class Problem02_06 {
    public boolean isPalindrome(ListNode head) {
    	if (head == null) return true;
    	if (head.next == null) return true;
    	ListNode slow = head, fast = head.next;
    	while (fast.next != null) {
    		fast = fast.next;
    		slow = slow.next;
    		if (fast.next != null) {
    			fast = fast.next;
    		}
    	}
    	ListNode p = slow.next;
    	ListNode pre = slow;
    	while (p.next != null) {
    		ListNode temp = p;
    		p = p.next;
    		temp.next = pre;
    		pre = temp;
    	}
    	p.next = pre;
    	ListNode q = head;
    	while (q.next != p && p.next != q.next) {
    		if (p.val != q.val) return false;
    		p = p.next;
    		q = q.next;
    	}
    	return q.val == p.val;
    }
}
