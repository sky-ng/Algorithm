package com.sky.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
    	int n = groupSizes.length;
    	if (n == 0) return new ArrayList<>();
    	Map<Integer, Deque<Integer>> map = new HashMap<>();
    	for (int i = 0; i < n; ++i) {
    		if (map.containsKey(groupSizes[i])) {
    			map.get(groupSizes[i]).add(i);
    		} else {
    			Deque<Integer> deque = new ArrayDeque<>();
    			deque.push(i);
    			map.put(groupSizes[i], deque);
    		}
    	}
    	List<List<Integer>> ans = new ArrayList<>();
    	for (Map.Entry<Integer, Deque<Integer>> entry : map.entrySet()) {
    		while (entry.getValue().size() != 0) {
    			List<Integer> list = new ArrayList<>();
    			int k = entry.getKey();
    			while (k-- > 0) {
    				list.add(entry.getValue().pop());
    			}
    			ans.add(list);
    		}
    	}
    	return ans;
    }
}
