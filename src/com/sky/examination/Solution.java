package com.sky.examination;

import java.util.Scanner;

public class Solution {
	
	private static String transform(String s) {
		//将所有非数字与字母的替换成空格，全部变小写
		s = s.replaceAll("[^a-z|A-Z|\\d]", " ").trim().toLowerCase();
		char[] ch_arr = s.toCharArray();
		//是否要小写
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ch_arr.length; ++i) {
			if (ch_arr[i] != ' ') {
				if (flag) {
					sb.append(ch_arr[i]);
				} else {
					sb.append((char)(ch_arr[i] + 'A' - 'a'));
					flag = true;
				}
			} else {
				flag = false;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(transform(s));
	}
}
