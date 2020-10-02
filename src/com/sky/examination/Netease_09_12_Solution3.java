package com.sky.examination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Netease_09_12_Solution3 {
	
	private static int getMaxSum(int[] arr) {
		Arrays.sort(arr);
		//用一个数组来装载7个栈
		List<Deque<Integer>> list = new ArrayList<>();
		for (int i = 0; i < 7; ++i) {
			Deque<Integer> stack = new LinkedList<>();
			list.add(stack);
		}
		//将数组中的数字分别压栈
		for (int num : arr) {
			list.get(num % 7).push(num);
		}
		for (int i = arr.length - 1; i >= 0; --i) {
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(getMaxSum(new int[] {7, 3, 1, 4}));//14
		System.out.println(getMaxSum(new int[] {6, 5}));//-1
		System.out.println(getMaxSum(new int[] {10, 20, 2, 29}));//49
		System.out.println(getMaxSum(new int[] {1, 1, 1, 1, 1, 1, 1}));//7
		System.out.println(getMaxSum(new int[] {1, 1, 1, 1, 1, 1}));//6
		System.out.println(getMaxSum(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));//14
	}
}
