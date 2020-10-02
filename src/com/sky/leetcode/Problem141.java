package com.sky.leetcode;

public class Problem141 {
    public boolean hasCycle(ListNode head) {
    	if (head == null) return false;
    	ListNode slow = head, fast = head.next;
    	while (slow != null && fast != null && fast.next != null) {
    		if (slow == fast) {
    			return true;
    		} else {
    			slow = slow.next;
    			fast = fast.next.next;
    		}
    	}
    	return false;
    }
}
