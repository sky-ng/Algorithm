package com.sky.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem1346 {
    public boolean checkIfExist(int[] arr) {
    	int n = arr.length;
    	Set<Integer> set = new HashSet<>();
    	for (int i = 0; i < n; ++i) {
    		if (set.contains(arr[i] * 2) || 
    				(arr[i] % 2 == 0 && set.contains(arr[i] / 2))) {
    			return true;
    		}
    		set.add(arr[i]);
    	}
    	return false;
    }
}
