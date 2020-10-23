package com.sky.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
    	int[] letters = new int[26];
    	Arrays.fill(letters, -1);
    	Map<Character, Integer> map = new HashMap<>();
    	char[] s_str = s.toCharArray();
    	for (int i = 0; i < s_str.length; ++i) {
    		if (letters[s_str[i] - 'a'] == -1) {
    			letters[s_str[i] - 'a'] = i;
    		} else {
    			map.put(s_str[i], i - letters[s_str[i] - 'a'] - 1);
    		}
    	}
    	int ans = -1;
    	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    		ans = Math.max(ans, entry.getValue());
    	}
    	return ans;
    }
}
