package com.sky.examination;

import java.util.Scanner;

public class ByteDance_09_06_Solution4 {
	
	private static int helper(int[] arr, int n, int w) {
		int mid = (arr.length - 1) >> 1;
		//判别是否可以操作成功
		for (int i = 0; i <= mid; ++i) {
			if ((arr[i] + i + 1) < w || (arr[n - 1 - i] + i + 1) < w) return 0;
		}
		//一定要注意取模 long
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int w = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}
		System.out.println(helper(arr, n, w));
	}
}
