package com.sky.leetcode;

public class Problem1208 {
    public int equalSubstring(String s, String t, int maxCost) {
    	char[] s_arr = s.toCharArray();
    	char[] t_arr = t.toCharArray();
    	int res = 0;
    	int left = 0, right = 0;
    	for (right = 0; right < s_arr.length; ) {
    		int temp = Math.abs(s_arr[right] - t_arr[right]);
    		if (maxCost >= temp) {
    			maxCost -= temp;
    			right++;
    		} else {
    			maxCost += Math.abs(s_arr[left] - t_arr[left]);
    			left++;
    		}
    		res = Math.max(res, right - left);
    	}
    	return res;
    }
}
