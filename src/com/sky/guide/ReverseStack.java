package com.sky.guide;

import java.util.Scanner;
import java.util.Stack;

/**
 * 【题目】如何仅用递归函数和栈操作逆序一个栈
 * 【描述】一个栈依次压入1、2、3、4、5，那么从栈顶到栈底分别为5、4、3、2、1。
 * 将这个栈转置后，从栈顶到栈底为1、2、3、4、5，也就是实现栈中元素逆序，
 * 但是只能用递归函数实现，不能用其他数据结构。
 * @author SKY
 *
 */
public class ReverseStack {
	
	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.empty()) {
			return result;
		} else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack) {
		if (stack.empty()) {
			return;
		} else {
			int i = getAndRemoveLastElement(stack);
			reverse(stack);
			stack.push(i);
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
    	Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
    	for (int i = 0; i < N; i++) {
    		int value = scanner.nextInt();
    		stack.push(value);
    	}
    	reverse(stack);
    	while (!stack.empty()) {
    		System.out.print(stack.pop() + " ");
    	}
	}
}
