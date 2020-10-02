package com.sky.offer;

import java.util.LinkedList;
import java.util.List;

public class Problem6 {
	
	private List<Integer> list = new LinkedList<>();
	
	private void helper(ListNode head) {
		if (head.next != null) {
			helper(head.next);
        }
        list.add(head.val);
	}
	
    public int[] reversePrint(ListNode head) {
    	if (head == null) return new int[0];
        helper(head);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
        	res[i] = list.get(i);
        }
    	return res;
    }
}
