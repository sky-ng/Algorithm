package com.sky.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem1528 {
    public String restoreString(String s, int[] indices) {
    	char[] s_str = s.toCharArray();
    	Map<Integer, Character> map = new HashMap<>();
    	for (int i = 0; i < indices.length; ++i) {
    		map.put(indices[i], s_str[i]);
    	}
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < indices.length; ++i) {
    		sb.append((char)map.get(i));
    	}
    	return sb.toString();
    }
}
