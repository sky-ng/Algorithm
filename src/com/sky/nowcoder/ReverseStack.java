package com.sky.nowcoder;

import java.util.Scanner;
import java.util.Stack;

/**
 * 用递归函数和栈操作逆序栈
 * @author SKY
 *
 */
public class ReverseStack {
	
	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.empty()) {
			return result;
		} else {
			int value = getAndRemoveLastElement(stack);
			stack.push(result);
			return value;
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
