package com.sky.leetcode;

public class Problem165 {
    public int compareVersion(String version1, String version2) {
    	String[] v1 = version1.split("\\.");
    	String[] v2 = version2.split("\\.");
    	int p = 0, q = 0;
    	while (p < v1.length && q < v2.length) {
    		if (Integer.valueOf(v1[p]) > Integer.valueOf(v2[q])) return 1;
    		else if (Integer.valueOf(v1[p]) < Integer.valueOf(v2[q])) return -1;
    		++p;
    		++q;
    	}
    	if (p == v1.length) {
    		if (q == v2.length) return 0;
    		for (; q < v2.length; ++q) {
    			if (Integer.valueOf(v2[q]) != 0) return -1;
    		}
    		return 0;
    	}
    	if (q == v2.length) {
    		for (; p < v1.length; ++p) {
    			if (Integer.valueOf(v1[p]) != 0) return 1;
    		}
    		return 0;
    	}
    	return 0;
    }
}
