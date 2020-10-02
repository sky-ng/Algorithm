package com.sky.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
        	map.put(num, map.containsKey(num) ? map.get(num) + 1 : 0);
        }
        int maxFrequence = 0;
        int num = 0;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if (entry.getValue() > maxFrequence) {
        		list.clear();
        		list.add(entry.getKey());
        		maxFrequence = entry.getValue();
        		num = entry.getKey();
        	} else if (entry.getValue() == maxFrequence) {
        		list.add(entry.getKey());
        	}
        }
        int min = Integer.MAX_VALUE;
        for (Integer i : list) {
        	int m = 0, n = nums.length - 1;
            while (m <= n) {
            	if (nums[m] != i) m++;
            	if (nums[n] != i) n--;
            	if (nums[m] == i && nums[n] == i) {
            		min = Math.min(min, n - m + 1);
            		break;
            	}
            }
        }
        
    	return min;
    }
    
    public static void main(String[] args) {
    	Problem697 p = new Problem697();
    	System.out.println(p.findShortestSubArray(new int[] {1, 2, 2, 3, 1, 4, 2}));
	}
}
