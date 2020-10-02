package com.sky.leetcode;

public class Problem86 {
    public ListNode partition(ListNode head, int x) {
    	if (head == null) return null;
    	ListNode blank1 = new ListNode(-1);
    	ListNode blank2 = new ListNode(-1);
    	ListNode cur1 = blank1, cur2 = blank2;
    	ListNode cur = head;
    	while (cur != null) {
    		if (cur.val < x) {
    			cur1.next = cur;
    			cur1 = cur1.next;
    		}
    		if (cur.val >= x) {
    			cur2.next = cur;
    			cur2 = cur2.next;
    		}
    		cur = cur.next;
    	}
    	cur1.next = blank2.next;
    	cur2.next = null;
    	return blank1.next;
    }
}
