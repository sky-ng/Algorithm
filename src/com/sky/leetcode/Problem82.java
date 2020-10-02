package com.sky.leetcode;

public class Problem82 {
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null) return null;
    	ListNode blankNode = new ListNode(head.val - 1);
    	blankNode.next = head;
    	ListNode cur = head, pre = blankNode;
    	while (cur != null) {
    		if (cur.next != null) {
    			while (cur.next != null && cur.val == cur.next.val) {
    				cur = cur.next;
    			}
    			if (pre.next == cur) {
    				pre = cur;
    				cur = cur.next;
    			} else {
    				cur = cur.next;
    				pre.next = cur;
    			}
    		} else {
    			if (pre.next != cur) {
    				pre.next = cur;
    			}
    			break;
    		}
    	}
    	return blankNode.next;
    }
}
