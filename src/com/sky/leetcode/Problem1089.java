package com.sky.leetcode;

public class Problem1089 {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        
        for (int i = len - 2; i >= 0; i--) {
        	if (arr[i] == 0) {
        		for (int j = len - 1; j > i; j--) {
        			arr[j] = arr[j - 1];
        		}
        	}
        }
    }
}
