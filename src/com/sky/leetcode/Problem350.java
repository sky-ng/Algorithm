package com.sky.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	List<Integer> list = new ArrayList<>();
    	for (int num : nums1) {
    		map.put(num, map.getOrDefault(num, 0) + 1);
    	}
    	for (int num : nums2) {
    		if (map.containsKey(num) && map.get(num) > 0) {
    			map.put(num, map.get(num) - 1);
    			list.add(num);
    		}
    	}
    	int[] ans = new int[list.size()];
    	for (int i = 0; i < ans.length; ++i) {
    		ans[i] = list.get(i);
    	}
    	return ans;
    }
}
