package com.sky.leetcode;

public class Problem925 {
    public boolean isLongPressedName(String name, String typed) {
        char[] name_arr = name.toCharArray();
        char[] typed_arr = typed.toCharArray();
        if (name_arr.length == 0 || typed_arr.length == 0) {
        	return false;
        }
        int p1 = 0, p2 = 0;
        char temp = name_arr[0];
        while (p1 < name_arr.length && p2 < typed_arr.length) {
        	if (name_arr[p1] == typed_arr[p2]) {
        		temp = name_arr[p1];
        		p1++;
        		p2++;
        	} else {
        		if (typed_arr[p2] == temp) {
        			p2++;
        		} else {
        			return false;
        		}
        	}
        }
        if (p1 < name_arr.length) {
        	return false;
        }
        while (p2 < typed_arr.length) {
        	if (typed_arr[p2] == temp) {
        		p2++;
        	} else {
        		return false;
        	}
        }
        return true;
    }
}
