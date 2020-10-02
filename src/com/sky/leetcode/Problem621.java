package com.sky.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Problem621 {
	
	//A 6 B 8 C 2 D 7 n=2
	//B D A | B D A | B D A | B D A | B D A | B D A | B D C | B 待命 C
	//B D A   C B D   A C B   D A B   D A B   D A B   D A B   D 待命 B
	//A B D A B D A B D A B D A B D A B D C B D C B
	//BDABDABDABDABDABDA
	public int leastInterval(char[] tasks, int n) {
		int[] arr = new int[26];
		for (char c : tasks) {
			arr[c - 'A']++;
		}
		int tasks_length = tasks.length;
		int res = 0;
		while (tasks_length > 0) {
			int temp = n;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					tasks_length--;
					arr[i]--;
					temp--;
					res++;
				}
			}
			if (tasks_length == 0) {
				return res;
			}
			while (temp >= 0) {
				temp--;
				res++;
			}
		}
		return res;
    }
	
	public static void main(String[] args) {
//		char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
//		System.out.println(new Problem621().leastInterval(tasks, 2));
		List<Character> list = new LinkedList<>();
		list.add(0, 'A');
		list.add(1, 'A');
		list.add(2, 'A');
		list.add(3, 'A');
		list.add(4, 'A');
		list.add(1, 'B');
		list.add(3, 'B');
		list.add(5, 'B');
		System.out.println(list);
	}
}
