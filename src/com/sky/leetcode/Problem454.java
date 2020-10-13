package com.sky.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	int n = A.length;
    	int ans = 0;
    	HashMap<Integer, Integer> map1 = new HashMap<>();
    	HashMap<Integer, Integer> map2 = new HashMap<>();
    	for (int i = 0; i < n; ++i) {
    		for (int j = 0; j < n; ++j) {
    			map1.put(A[i] + B[j], map1.getOrDefault(A[i] + B[j], 0) + 1);
    			map2.put(C[i] + D[j], map2.getOrDefault(C[i] + D[j], 0) + 1);
    		}
    	}
    	for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
    		int key = entry.getKey();
    		int value = entry.getValue();
    		ans += value * map2.getOrDefault(-key, 0);
    	}
    	return ans;
    }
}
