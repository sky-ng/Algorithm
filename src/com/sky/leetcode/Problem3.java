package com.sky.leetcode;

import java.util.HashSet;

public class Problem3 {
	
    public int lengthOfLongestSubstring(String s) {
    	HashSet<Character> set = new HashSet<>();
    	char[] ch_arr = s.toCharArray();
    	int max = 0, cnt = 0;
    	int i = 0, j = 0;
    	while (i < ch_arr.length) {
    		if (set.contains(ch_arr[i])) {
    			set.remove(ch_arr[j++]);
    			--cnt;
    		} else {
    			++cnt;
    			max = max >= cnt ? max : cnt;
    			set.add(ch_arr[i++]);
    		}
    		
    	}
    	return max;
    }
    
    public static void main(String[] args) {
    	Problem3 p = new Problem3();
    	//3
    	System.out.println(p.lengthOfLongestSubstring("abcabcbb"));
    	//1
    	System.out.println(p.lengthOfLongestSubstring("bbbbb"));
    	//3
    	System.out.println(p.lengthOfLongestSubstring("pwwkew"));
	}
}
