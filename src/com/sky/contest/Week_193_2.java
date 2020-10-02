package com.sky.contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Week_193_2 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
    	
    	Map<Integer, Integer> map = new TreeMap<>();
    	for (int i = 0; i < arr.length; ++i) {
    		if (map.containsKey(arr[i])) {
    			map.put(arr[i], map.get(arr[i]) + 1);
    		} else {
    			map.put(arr[i], 1);
    		}
    	}
    	List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
    	
        Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer, Integer> o1,
            		Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
            
        });

		for (int i = 0; k > 0; --k) {
			map.put(list.get(0).getKey(), list.get(0).getValue() - 1);
			if (list.get(0).getValue() <= 0) {
				list.remove(0);
			}
		}
		return list.size();
    }
}
