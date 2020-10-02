package com.sky.leetcode;

public class Problem876 {
    public ListNode middleNode(ListNode head) {
    	if (head == null) return null;
    	ListNode current = head;
    	ListNode result = head;
    	int count = 1;
    	while (current.next != null) {
    		count++;
    		current = current.next;
    		if (count % 2 == 0) {
    			result = result.next;
    		}
    	}
        return result;
    }
}
