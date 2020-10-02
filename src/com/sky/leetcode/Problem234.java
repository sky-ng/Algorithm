package com.sky.leetcode;

import java.util.Stack;

public class Problem234 {
    public boolean isPalindrome(ListNode head) {
    	if (head == null) {
    		return true;
    	}
    	Stack<Integer> stack = new Stack<>();
    	ListNode current = head;
    	while (current != null) {
    		stack.push(current.val);
    		current = current.next;
    	}
    	int cnt = stack.size() / 2;
    	while (cnt > 0) {
    		cnt--;
    		if (stack.pop() != head.val) {
    			return false;
    		}
    		head = head.next;
    	}
    	return true;
    }
}
