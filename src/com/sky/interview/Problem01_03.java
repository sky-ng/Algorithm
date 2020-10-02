package com.sky.interview;

public class Problem01_03 {
    public String replaceSpaces(String S, int length) {
    	char[] charArray = S.toCharArray();
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < length; ++i) {
    		if (charArray[i] == ' ') sb.append("%20");
    		else sb.append(charArray[i]);
    	}
    	return sb.toString();
    }
}
