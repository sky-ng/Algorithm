package com.sky.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem225 {

}

class MyStack {
	
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (queue1.size() != 1) {
        	queue2.add(queue1.poll());
        }
        int result = queue1.poll();
        while (!queue2.isEmpty()) {
        	queue1.add(queue2.poll());
        }
        return result;
    }
    
    /** Get the top element. */
    public int top() {
    	while (!queue1.isEmpty()) {
        	queue2.add(queue1.poll());
        }
    	while (queue2.size() != 1) {
    		queue1.add(queue2.poll());
    	}
    	int res = queue2.poll();
    	queue1.add(res);
    	return res;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() ? true : false;
    }
}
