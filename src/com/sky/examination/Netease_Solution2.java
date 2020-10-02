package com.sky.examination;

import java.util.Arrays;
import java.util.Scanner;

public class Netease_Solution2 {
	
	private static void helper(int[][] arr, int n) {
		//递归出口
		if (n == 0) {
			return;
		}
		int maxRowIdx = 0, maxColIdx = 0;
		int[] rowSum = new int[n];
		int[] colSum = new int[n];
		for (int i = n - 1; i >= 0; --i) {
			for (int j = n - 1; j >= 0; --j) {
				rowSum[i] += arr[i][j];
				colSum[i] += arr[j][i];
			}
		}
		int perfect = -0x3f3f3f3f;
		for (int i = n - 1; i >= 0; --i) {
			for (int j = n - 1; j >= 0; --j) {
				int sum = rowSum[i] + colSum[j] - arr[i][j];
				if (sum >= perfect) {
					perfect = sum;
					maxRowIdx = i;
					maxRowIdx = j;
				}
			}
		}
		System.out.println("OUTPUT:");
		for (int i = 0; i < n; ++i) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println((maxRowIdx + 1) + " " + (maxColIdx + 1));
		int[][] newArr = new int[n - 1][n - 1];
		int curRow = 0, curCol = 0;
		for (int i = 0; i < n; ++i) {
			curCol = 0;
			if (i != maxRowIdx) {
				for (int j = 0; j < n; ++j) {
					if (j != maxColIdx) {
						newArr[curRow][curCol] = arr[i][j];
						++curCol;
					}
				}
				++curRow;
			}
		}
		helper(newArr, n - 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				arr[i][j] = in.nextInt();
			}
		}
		helper(arr, n);
	}
}
