package com.sky.offer;

import java.util.Deque;
import java.util.LinkedList;

public class Problem59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
    	if (nums == null || nums.length == 0) {
    		return new int[0];
    	}
    	int[] res = new int[nums.length - k + 1];
    	Deque<Integer> deque = new LinkedList<>();
    	for (int i = 0; i < k; i++) {
    		while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
    			deque.removeLast();
    		}
    		deque.addLast(nums[i]);
    	}
    	res[0] = deque.peekFirst();
    	for (int i = k; i < nums.length; i++) {
    		if (deque.peekFirst() == nums[i - k]) deque.removeFirst();
    		while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
    			deque.removeLast();
    		}
    		deque.addLast(nums[i]);
    		res[i - k + 1] = deque.peekFirst();
    	}
    	return res;
    }
}
