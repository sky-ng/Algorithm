package com.sky.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem1577 {
    public int numTriplets(int[] nums1, int[] nums2) {
    	int n1 = nums1.length, n2 = nums2.length;
    	//下面两个map表示nums1[i]^2和nums2[i]^2
    	HashMap<Long, Integer> map1 = new HashMap<>();
    	HashMap<Long, Integer> map2 = new HashMap<>();
    	//下面两个map表示nums1[j] * nums1[k]和nums2[j] * nums2[k]
    	HashMap<Long, Integer> map3 = new HashMap<>();
    	HashMap<Long, Integer> map4 = new HashMap<>();
    	for (int i = 0; i < n1; ++i) {
    		long key = (long) nums1[i] * nums1[i];
    		map1.put(key, map1.getOrDefault(key, 0) + 1);
    		for (int j = i + 1; j < n1; ++j) {
    			long k = (long) nums1[i] * nums1[j];
    			map3.put(k, map3.getOrDefault(k, 0) + 1);
    		}
    	}
    	for (int i = 0; i < n2; ++i) {
    		long key = (long) nums2[i] * nums2[i];
    		map2.put(key, map2.getOrDefault(key, 0) + 1);
    		for (int j = i + 1; j < n2; ++j) {
    			long k = (long) nums2[i] * nums2[j];
    			map4.put(k, map4.getOrDefault(k, 0) + 1);
    		}
    	}
    	int ans = 0;
    	for (Map.Entry<Long, Integer> entry : map1.entrySet()) {
    		if (map4.containsKey(entry.getKey())) {
    			ans += (entry.getValue() * map4.get(entry.getKey()));
    		}
    	}
    	for (Map.Entry<Long, Integer> entry : map2.entrySet()) {
    		if (map3.containsKey(entry.getKey())) {
    			ans += (entry.getValue() * map3.get(entry.getKey()));
    		}
    	}
    	return ans;
    }
    public static void main(String[] args) {
    	Problem1577 p = new Problem1577();
    	System.out.println(p.numTriplets(new int[] {43024,99908}, new int[] {1864}));
	}
}
