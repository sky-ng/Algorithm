package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class Problem1019 {
    public int[] nextLargerNodes(ListNode head) {
    	if (head == null) {
    		return new int[0];
    	}
    	Stack<ListNode> stack = new Stack<>();
    	ArrayList<Integer> list = new ArrayList<>();
    	ListNode p = head;
    	int cnt = 0;
    	while (p != null) {
    		int i = cnt - 1;
    		while (!stack.empty() && stack.peek().val < p.val) {
    			stack.pop();
    			while (i >= 0 && list.get(i) != 0) {
    				i--;
    			}
    			list.set(i, p.val);
    		}
    		stack.push(p);
    		list.add(0);
    		p = p.next;
    		cnt++;
    	}
    	int[] res = new int[cnt];
    	for (int i = 0; i < cnt; i++) {
    		res[i] = list.get(i);
    	}
    	return res;
    }
}
