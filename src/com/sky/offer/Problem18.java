package com.sky.offer;

public class Problem18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode curNode = head;
        if (curNode.val == val) {
        	curNode = curNode.next;
        	return curNode;
        }
        while (curNode.next != null && curNode.next.val != val) {
        	curNode = curNode.next;
        }
        if (curNode.next != null) {
        	curNode.next = curNode.next.next;
        }
        return head;
    }
}
