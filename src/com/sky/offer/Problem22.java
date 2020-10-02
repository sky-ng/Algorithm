package com.sky.offer;

public class Problem22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode lastNode = head;
        ListNode kthNode = head;
        while (--k != 0) {
        	lastNode = lastNode.next;
        }
        while (lastNode.next != null) {
        	lastNode = lastNode.next;;
        	kthNode = kthNode.next;
        }
    	return kthNode;
    }
}
