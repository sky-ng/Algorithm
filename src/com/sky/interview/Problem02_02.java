package com.sky.interview;

public class Problem02_02 {
    public int kthToLast(ListNode head, int k) {
    	ListNode fast = head;
    	ListNode slow = head;
    	while (--k != 0) {
    		fast = fast.next;
    	}
    	while (fast.next != null) {
    		slow = slow.next;
    		fast = fast.next;
    	}
    	return slow.val;
    }
}
