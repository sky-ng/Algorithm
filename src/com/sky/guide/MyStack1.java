package com.sky.guide;

import java.util.Stack;

/**
 * 【题目】设计一个有getMin功能的栈 
 * 【描述】实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
 * 【要求】
 * 1.pop、push、getMin操作的时间复杂度都是O(1)。
 * 2.设计的栈类型可以使用现成的栈结构。
 * @author SKY
 *
 */
public class MyStack1 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public MyStack1() {
		stackData = new Stack<>();
		stackMin = new Stack<>();
	}
	
	public void push(int newNum) {
		if (stackMin.isEmpty()) {
			stackMin.push(newNum);
		} else if (newNum <= this.getMin()) {
			stackMin.push(newNum);
		}
		stackData.push(newNum);
	}
	
	public int pop() {
		if (this.stackData.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		int value = stackData.pop();
		if (value == this.getMin()) {
			this.stackMin.pop();
		}
		return value;
	}
	
	public int getMin() {
		if (stackMin.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		return stackMin.peek();
	}
}
