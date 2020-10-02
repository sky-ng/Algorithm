package com.sky.guide;

import java.util.Stack;

/**
 * 【题目】由两个栈组成的队列
 * 【描述】编写一个类，用两个栈实现队列，支持队列的基本操作（add、poll、peek）
 * @author SKY
 *
 */
public class TwoStackQueue {
	private Stack<Integer> stackPush;
	private Stack<Integer> stackPop;
	
	public TwoStackQueue() {
		stackPush = new Stack<>();
		stackPop = new Stack<>();
	}
	
	public void add(int pushInt) {
		stackPush.push(pushInt);
	}
	
	public int poll() {
		if (stackPush.isEmpty() && stackPop.isEmpty()) {
			throw new RuntimeException("Queue is empty.");
		} else if (stackPop.empty()) {
			while (!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	
	public int peek() {
		if (stackPush.isEmpty() && stackPop.isEmpty()) {
			throw new RuntimeException("Queue is empty.");
		} else if (stackPop.empty()) {
			while (stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
}
