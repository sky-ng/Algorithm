package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    	Arrays.sort(arr);
    	int minInterval = 0x3f3f3f3f;
    	List<List<Integer>> ans = new ArrayList<>();
    	for (int i = 1; i < arr.length; ++i) {
    		if (arr[i] - arr[i - 1] < minInterval) {
    			minInterval = arr[i] - arr[i - 1];
    		}
    	}
    	for (int i = 1; i < arr.length; ++i) {
    		if (arr[i] - arr[i - 1] == minInterval) {
    			List<Integer> list = new ArrayList<>();
    			list.add(arr[i - 1]);
    			list.add(arr[i]);
    			ans.add(list);
    		}
    	}
    	return ans;
    }
}
