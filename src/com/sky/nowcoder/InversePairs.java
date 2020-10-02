package com.sky.nowcoder;

import java.util.Scanner;

/**
 * 逆序对
 * @author 12874
 *
 */
public class InversePairs {
	
	public int inversePairsCount(int[] arr, int arrSize) {
		if (arr == null || arrSize < 2) {
			return 0;
		}
		return inversePairsProcess(arr, 0, arrSize - 1);
	}
	
	public int inversePairsProcess(int[] arr, int L, int R) {
		if (L == R) {
			return 0;
		}
		int mid = L + ((R - L) >> 1);
		return inversePairsProcess(arr, L, mid) + 
				inversePairsProcess(arr, mid + 1, R) + merge(arr, L, mid, R);
	}
	
	public int merge(int[] arr, int L, int mid, int R) {
		int[] help = new int[R - L + 1];
		int i = 0;
		int p1 = L;
		int p2 = mid + 1;
		int res = 0;
		while (p1 <= mid && p1 <= R) {
			res += (arr[p1] > arr[p2] ? (mid -L + 1) : 0);
			help[i++] = (arr[p1] < arr[p2] ? arr[p1++] : arr[p2++]);
		}
		while (p1 <= mid) {
			help[i++] = arr[p1++];
		}
		while (p2 <= R) {
			help[i++] = arr[p2++];
		}
		for (i = 0; i < help.length; i++) {
			arr[L + i] = help[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrSize = scanner.nextInt();
		int[] arr = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(new InversePairs().inversePairsCount(arr, arrSize));
	}
	
}
