package com.sky.interview;

import java.util.HashSet;
import java.util.Set;

public class Problem02_01 {
    public ListNode removeDuplicateNodes(ListNode head) {
    	Set<Integer> set = new HashSet<>();
    	ListNode blankNode = new ListNode(-1);
    	blankNode.next = head;
    	ListNode cur = head;
    	ListNode pre = blankNode;
    	while (cur != null) {
    		if (set.contains(cur.val)) {
    			pre.next = cur.next;
    			cur = cur.next;
    		} else {
    			set.add(cur.val);
    			cur = cur.next;
    			pre = pre.next;
    		}
    	}
    	return blankNode.next;
    }
}
