package com.sky.leetcode;

import java.util.HashMap;

public class Problem290 {
    public boolean wordPattern(String pattern, String s) {
    	String[] s_split = s.split(" ");
    	char[] pattern_str = pattern.toCharArray();
    	//首先判断pattern长度是否和s中单词长度相等
    	if (pattern_str.length != s_split.length) return false;
    	int n = s_split.length;
    	HashMap<Character, String> map1 = new HashMap<>();
    	HashMap<String, Character> map2 = new HashMap<>();
    	for (int i = 0; i < n; ++i) {
    		if (map1.containsKey(pattern_str[i])) {
    			if (!map1.get(pattern_str[i]).equals(s_split[i])) {
    				return false;
    			}
    		} else {
    			map1.put(pattern_str[i], s_split[i]);
    		}
    	}
    	for (int i = 0; i < n; ++i) {
    		if (map2.containsKey(s_split[i])) {
    			if (!map2.get(s_split[i]).equals(pattern_str[i])) {
    				return false;
    			}
    		} else {
    			map2.put(s_split[i], pattern_str[i]);
    		}
    	}
    	return true;
    }
}
