package com.sky.leetcode;

import java.util.Arrays;

public class Problem1033 {
    public int[] numMovesStones(int a, int b, int c) {
    	int[] arr = {a, b, c};
    	Arrays.sort(arr);
    	if (arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2]) {
    		return new int[] {0, 0};
    	}
    	int max = arr[2] - arr[0] - 2;
    	int min = Math.min(arr[1] - arr[0], arr[2] - arr[1]) <= 2 ? 1 : 2;
    	return new int[] {min, max};
    }
}
