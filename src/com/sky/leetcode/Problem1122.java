package com.sky.leetcode;

import java.util.Arrays;

public class Problem1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[1001];
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        for (int i = 0; i < arr1Length; i++) {
        	arr[arr1[i]]++;
        }
        int j = 0;
        for (int i = 0; i < arr2Length; i++) {
        	while (arr[arr2[i]] > 0) {
        		arr[arr2[i]]--;
        		arr1[j++] = arr2[i];
        	}
        }
        for (int i = 0; i < 1001; i++) {
        	while (arr[i] != 0) {
        		arr1[j++] = i;
        		arr[i]--;
        	}
        }
    	return arr1;
    }
    
    public static void main(String[] args) {
    	Problem1122 p = new Problem1122();
    	
    	System.out.println(Arrays.toString(p.relativeSortArray(new int[] {2,3,1,3,2,4,6,7,9,2,19}, 
    			new int[] {2,1,4,3,9,6})));
	}
}
