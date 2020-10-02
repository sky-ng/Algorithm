package com.sky.leetcode;

import java.util.HashMap;

public class Problem1171 {
    public ListNode removeZeroSumSublists(ListNode head) {
    	ListNode blankNode = new ListNode(0);
    	blankNode.next = head;
    	HashMap<Integer, ListNode> map = new HashMap<>();
    	map.put(0, blankNode);
    	ListNode cur = head;
    	int cnt = 0;
    	while (cur != null) {
    		cnt += cur.val;
    		map.put(cnt, cur);
    		cur = cur.next;
    	}
    	for (cnt = 0, cur = blankNode; cur != null; cur = cur.next) {
    		cnt += cur.val;
    		if (map.get(cnt) != cur) {
    			cur.next = map.get(cnt).next;
    		}
    	}
    	return blankNode.next;
    }
}
