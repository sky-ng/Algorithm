package com.sky.contest;

import java.util.Arrays;

public class Week_192_2 {
    public int[] getStrongest(int[] arr, int k) {
    	Arrays.sort(arr);
    	int[] res = new int[k];
    	int i = 0, j = arr.length - 1;
    	int idx = 0;
    	int m = arr[i + ((j - i) >> 1)];
    	while (k-- > 0) {
    		if (helper(arr, m, i, j)) {
    			res[idx] = arr[i];
    			idx++;
    			i++;
    		} else {
    			res[idx] = arr[j];
    			idx++;
    			j--;
    		}
    	}
    	return res;
    }
    
    private boolean helper(int[] arr, int m, int i, int j) {
    	if (Math.abs(arr[i] - m) > Math.abs(arr[j] - m) || (Math.abs(arr[i] - m) == Math.abs(arr[j] - m) && arr[i] > arr[j])) {
    		return true;
    	}
    	return false;
    }
}
