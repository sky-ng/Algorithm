package com.sky.examination;

import java.util.Scanner;

public class Tencent_08_23_Solution4 {
	
	private static int getMinOperatingTimes(int[] arr, int n) {
		int ans = n;
		int maxLength = 0;
		int minLength = 0x3f3f3f3f;
		for (int i = 0; i < n; ++i) {
			minLength = Math.min(minLength, arr[i]);
		}
		int tmp1 = 0;
		int tmp2 = 0;
		for (int i = 0; i < n; ++i) {
			arr[i] -= minLength;
			if (arr[i] > 0) {
				maxLength = Math.max(maxLength, arr[i]);
				++tmp1;
			}
		}
		for (int i = 1; i <= maxLength; ++i) {
			boolean isContinuous = false;
			for (int j = 0; j < n; ++j) {
				if (!isContinuous) {
					if (arr[j] >= i) {
						isContinuous = true;
						++tmp2;
					}
				} else {
					if (arr[j] < i) {
						isContinuous = false;
					}
				}
			}
		}
		return Math.min(ans, Math.min(tmp1, tmp2) + minLength);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i <n; ++i) {
			arr[i] = in.nextInt();
		}
		System.out.println(getMinOperatingTimes(arr, n));
	}
}
