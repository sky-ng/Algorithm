package com.sky.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem10_02 {
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> ans = new ArrayList<>();
    	Map<String, List<String>> map = new HashMap<>();
    	for (int i = 0; i < strs.length; ++i) {
    		char[] str = strs[i].toCharArray();
    		Arrays.sort(str);
    		String s = new String(str);
    		if (map.containsKey(s)) {
    			map.get(s).add(strs[i]);
    		} else {
    			List<String> temp = new ArrayList<>();
    			temp.add(strs[i]);
    			map.put(s, temp);
    		}
    	}
    	for (Map.Entry<String, List<String>> entry : map.entrySet()) {
    		ans.add(entry.getValue());
    	}
    	return ans;
    }
    
}
