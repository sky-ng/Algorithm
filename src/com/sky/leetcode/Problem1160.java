package com.sky.leetcode;

public class Problem1160 {
    public int countCharacters(String[] words, String chars) {
    	int sum = 0;
        for (String word : words) {
        	String temp = chars;
        	int len = word.length();
        	boolean flag = true;
        	for (int i = 0; i < len; i++) {
        		if (temp.contains(String.valueOf(word.charAt(i)))) {
        			temp = temp.replaceFirst(String.valueOf(word.charAt(i)), "");
        		} else {
        			flag = false;
        			break;
        		}
        	}
        	if (flag) {
        		sum += len;
        	}
        }
        
        return sum;
    }
    
}
