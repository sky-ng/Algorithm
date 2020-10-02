package com.sky.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem13 {
	
	private boolean helper(char former, char latter) {
		if (former == 'I' && (latter == 'V' || latter == 'X')) {
			return false;
		} else if (former == 'X' && (latter == 'L' || latter == 'C')) {
			return false;
		} else if (former == 'C' && (latter == 'D' || latter == 'M')) {
			return false;
		} else {
			return true;
		}
	}
	
    public int romanToInt(String s) {
    	Map<Character, Integer> map = new HashMap<>();
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);
    	int res = map.get(s.charAt(0));
    	for (int i = 1; i < s.length(); i++) {
    		if (helper(s.charAt(i - 1), s.charAt(i))) {
    			res += map.get(s.charAt(i));
    		} else {
    			res = res - 2 * map.get(s.charAt(i - 1)) + map.get(s.charAt(i));
    		}
    	}
    	return res;
    }
}
