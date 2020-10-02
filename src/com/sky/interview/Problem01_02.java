package com.sky.interview;

public class Problem01_02 {
    public boolean CheckPermutation(String s1, String s2) {
    	int[] ascii = new int[128];
    	for (char c : s1.toCharArray()) {
    		++ascii[c];
    	}
    	for (char c : s2.toCharArray()) {
    		--ascii[c];
    	}
    	for (int i : ascii) {
    		if (i != 0) return false;
    	}
    	return true;
    }
}
