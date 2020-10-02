package com.sky.leetcode;

public class Problem520 {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        boolean isLastLowerCase = false;
        if (word.charAt(len - 1) >= 'a' && word.charAt(len - 1) <= 'z') {
        	isLastLowerCase = true;
        }
        if (isLastLowerCase) {
        	for (int i = len - 2; i > 0; i--) {
            	if (word.charAt(i) < 'a' || word.charAt(i) > 'z') {
            		return false;
            	}
            }
        } else {
        	for (int i = len - 2; i >= 0; i--) {
            	if (word.charAt(i) < 'A' || word.charAt(i) > 'Z') {
            		return false;
            	}
            }
        }
        return true;
    }
}
