package com.sky.leetcode;

public class Problem234 {
    public boolean isPalindrome(ListNode head) {
    	if (head == null) return true;
    	ListNode blankNode = new ListNode(0);
    	blankNode.next = head;
    	ListNode slow = blankNode, fast = blankNode;
    	while (fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	ListNode pre = slow, post = slow.next;
    	while (post != null) {
    		slow = post;
    		post = slow.next;
    		slow.next = pre;
    		pre = slow;
    	}
    	fast = head;
    	do {
    		if (fast.val != slow.val) return false;
            if (slow.next == fast) break;
    		fast = fast.next;
    		slow = slow.next;
    	} while (slow != fast);
    	return true;
    }
}
