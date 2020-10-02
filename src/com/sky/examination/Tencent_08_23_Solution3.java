package com.sky.examination;

import java.util.Scanner;

public class Tencent_08_23_Solution3 {
	
	private static int getMaxVal(String n) {
		int ans = 0;
		long temp = 0;
		int digit = n.length();
		for (int i = 0; i < digit - 1; ++i) {
			ans += 9;
			temp *= 10;
			temp += 9;
		}
		int beginNum = n.charAt(0) - '0';
		ans += (beginNum - 1);
		long num = beginNum - 1;
		for (int i = 0; i < digit - 1; ++i) {
			num *= 10;
		}
		temp += num;
		long anotherNum = Long.valueOf(n) - temp;
		while (anotherNum != 0) {
			ans += (int) (anotherNum % 10);
			anotherNum /= 10;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; ++i) {
			String n = in.next();
			System.out.println(getMaxVal(n));
		}
	}
}
