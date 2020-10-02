package com.sky.leetcode;

import java.util.List;

public class Problem524 {
	
	private boolean isSubsequence(String s, String t) {
		int curS = 0, curT = 0;
		int lenS = s.length(), lenT = t.length();
		while (curS < lenS && curT < lenT) {
			if (s.charAt(curS) == t.charAt(curT)) {
				curT++;
			}
			curS++;
		}
		return curT == lenT ? true : false;
	}
	
    public String findLongestWord(String s, List<String> d) {
    	String res = "";
    	for (String t : d) {
    		if (isSubsequence(s, t) && (t.length() > res.length() || (t.length() == res.length() && t.compareTo(res) < 0))) {
    			res = t;
    		}
    	}
    	return res;
    }

}
