package com.sky.guide;

import java.util.Stack;

/**
 * 【题目】用一个栈实现另一个栈的排序
 * 【描述】一个栈中元素的类型为整型，现在想将该栈从顶到底按从大到小的顺序排序，只需申请一个栈。
 * 除此之外，可以申请新的变量，但不能申请额外的数据结构。如何完成排序？
 * @author SKY
 *
 */
public class SortStack {
	public static void sortStackByStack(Stack<Integer> stack) {
		Stack<Integer> help = new Stack<>();
		while (!stack.isEmpty()) {
			int cur = stack.pop();
			while (!help.isEmpty() && help.peek() < cur) {
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while (!help.isEmpty()) {
			stack.push(help.pop());
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(3);
		stack.add(5);
		stack.add(3);
		stack.add(2);
		stack.add(67);
		stack.add(1);
		stack.add(44);
		stack.add(33);
		stack.add(0);
		sortStackByStack(stack);
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
