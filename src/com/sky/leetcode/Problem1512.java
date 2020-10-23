package com.sky.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem1512 {
    public int numIdenticalPairs(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
    	int ans = 0;
    	for (int num : nums) {
    		map.put(num, map.getOrDefault(num, 0) + 1);
    	}
    	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    		if (entry.getValue() > 1) {
    			ans += C(entry.getValue(), 2);
    		}
    	}
    	return ans;
    }
    
    private int C(int m, int n) {
    	int A = 1, B = 1;
    	for (int i = 0; i < n; ++i) 
    		A *= (m - i);
    	while (n > 0)
    		B *= n--;
    	return A / B;
    }
    
    public static void main(String[] args) {
    	Problem1512 p = new Problem1512();
    	int[] nums = {1, 2, 3, 1, 1, 3};
    	System.out.println(p.numIdenticalPairs(nums));
	}
}
