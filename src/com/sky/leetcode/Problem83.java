package com.sky.leetcode;

public class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null) return null;
    	ListNode currentNode = head.next;
    	ListNode previousNode = head;
    	while (currentNode != null) {
    		if (currentNode.val == previousNode.val) {
    			currentNode = currentNode.next;
    			previousNode.next = currentNode;
    		} else {
    			previousNode = currentNode;
    			currentNode = currentNode.next;
    		}
    	}
    	return head;
    }
}
