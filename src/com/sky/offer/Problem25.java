package com.sky.offer;

public class Problem25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if (l1 == null) return l2;
    	if (l2 == null) return l1;
    	ListNode res;
    	if (l1.val < l2.val) {
    		res = l1;
    		l1 = l1.next;
    	} else {
    		res = l2;
    		l2 = l2.next;
    	}
    	ListNode currentNode = res;
    	while (l1 != null && l2 != null) {
    		if (l1.val < l2.val) {
    			currentNode.next = l1;
    			currentNode = currentNode.next;
    			l1 = l1.next;
    		} else {
    			currentNode.next = l2;
    			currentNode = currentNode.next;
    			l2 = l2.next;
    		}
    	}
    	if (l1 == null) {
    		currentNode.next = l2;
    	}
    	if (l2 == null) {
    		currentNode.next = l1;
    	}
        return res;
    }
}
