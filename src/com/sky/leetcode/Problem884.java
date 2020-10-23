package com.sky.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem884 {
    public String[] uncommonFromSentences(String A, String B) {
    	HashMap<String, Integer> map1 = new HashMap<>();
    	for (String word : A.split(" ")) {
    		if (map1.containsKey(word)) {
    			map1.put(word, -1);
    		} else {
    			map1.put(word, 1);
    		}
    	}
    	HashMap<String, Integer> map2 = new HashMap<>();
    	for (String word : B.split(" ")) {
    		if (map2.containsKey(word)) {
    			map2.put(word, -1);
    		} else {
    			map2.put(word, 1);
    		}
    	}
    	ArrayList<String> list = new ArrayList<>();
    	for (Map.Entry<String, Integer> entry : map1.entrySet()) {
    		if (entry.getValue() == 1 && !map2.containsKey(entry.getKey())) {
    			list.add(entry.getKey());
    		}
    	}
    	for (Map.Entry<String, Integer> entry : map2.entrySet()) {
    		if (entry.getValue() == 1 && !map1.containsKey(entry.getKey())) {
    			list.add(entry.getKey());
    		}
    	}
    	String[] res = new String[list.size()];
    	for (int i = 0; i < res.length; ++i) {
    		res[i] = list.get(i);
    	}
    	return res;
    }
}
