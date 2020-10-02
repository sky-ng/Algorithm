package com.sky.contest;

import java.util.Arrays;

public class Week_196_1 {
    public boolean canMakeArithmeticProgression(int[] arr) {
    	Arrays.sort(arr);
    	int n = arr.length;
    	int before = 0;
    	boolean flag = false;
    	for (int i = 0; i < n - 1; ++i) {
    		if (!flag) {
    			flag = true;
    			before = arr[i + 1] - arr[i];
    		} else {
    			if (arr[i + 1] - arr[i] != before) {
    				return false;
    			} else {
    				before = arr[i + 1] - arr[i];
    			}
    		}
    		
    	}
    	
    	return true;
    }
}
