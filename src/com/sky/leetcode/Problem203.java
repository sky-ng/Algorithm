package com.sky.leetcode;

public class Problem203 {
    public ListNode removeElements(ListNode head, int val) {
    	if (head == null) return null;
    	ListNode virtualHead = new ListNode(-1);
        virtualHead.next = head;
        ListNode cur = head;
    	ListNode pre = virtualHead;
        while (cur != null) {
        	if (cur.val == val) {
        		cur = cur.next;
        		pre.next = cur;
        	} else {
        		pre = cur;
        		cur = cur.next;
        	}
        }
    	return virtualHead.next;
    }
}
