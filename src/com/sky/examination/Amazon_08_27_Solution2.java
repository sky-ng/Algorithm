package com.sky.examination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Amazon_08_27_Solution2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		int sum = arr[0];
		int lastNum = 0;
		for (int i = 1; i < n; ++i) {
			if (arr[i] == arr[i - 1]) {
				sum += arr[i];
			} 
			else if (arr[i] == (arr[i - 1] + 1)) {
				list.add(sum);
				lastNum = arr[i - 1];
				sum = arr[i];
			} 
			else {
				list.add(sum);
				list.add(0);
				lastNum = arr[i - 1];
				sum = arr[i];
			}
		}
		if (lastNum + 1 != arr[n - 1])
			list.add(0);
		list.add(sum);
		System.out.println(list);
		int size = list.size();
		int[] dp = new int[size];
		dp[0] = list.get(0);
		dp[1] = Math.max(dp[0], list.get(1));
		for (int i = 2; i < size; ++i) {
			dp[i] = Math.max(dp[i - 2] + list.get(i), dp[i - 1]);
		}
		System.out.println(dp[size - 1]);
	}
}
