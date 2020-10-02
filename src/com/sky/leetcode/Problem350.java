package com.sky.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        List<Integer> res = new LinkedList<>();
        for (int num : nums1) {
        	map1.put(num, map1.containsKey(num) ? map1.get(num) + 1 : 1);
        }
        for (int num : nums2) {
        	map2.put(num, map2.containsKey(num) ? map2.get(num) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
        	Integer key = entry.getKey();
        	if (map2.containsKey(key)) {
        		Integer value = entry.getValue();
        		int n = Math.min(map2.get(key), value);
        		for (int i = 0; i < n; i++) {
        			res.add(key);
        		}
        	}
        }
        int len = res.size();
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
        	ans[i] = res.get(i);
        }
    	return ans;
    }
}
