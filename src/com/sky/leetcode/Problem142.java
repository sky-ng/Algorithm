package com.sky.leetcode;

public class Problem142 {
    public ListNode detectCycle(ListNode head) {
    	if (head == null) return null;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	if (slow == fast) {
        		fast = head;
        		while (fast != slow) {
                	fast = fast.next;
                	slow = slow.next;
                }
        		return fast;
        	}
        }
        return null;
    }
}
