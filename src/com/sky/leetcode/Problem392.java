package com.sky.leetcode;

public class Problem392 {
    public boolean isSubsequence(String s, String t) {
    	int sLen = s.length(), tLen = t.length();
    	int sp = 0, tp = 0;
    	while (sp < sLen && tp < tLen) {
    		if (s.charAt(sp) == t.charAt(tp)) {
    			sp++;
    			tp++;
    		} else {
    			tp++;
    		}
    	}
    	return sp == sLen ? true : false;
    }
}
