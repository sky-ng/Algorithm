package com.sky.leetcode;

public class Problem383 {
    public boolean canConstruct(String ransomNote, String magazine) {
    	char[] r_ch_arr = ransomNote.toCharArray();
    	char[] m_ch_arr = magazine.toCharArray();
    	int[] arr = new int[26];
    	for (char m : m_ch_arr) {
    		arr[m - 'a']++;
    	}
    	for (char r : r_ch_arr) {
    		arr[r - 'a']--;
    		if (arr[r - 'a'] < 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
