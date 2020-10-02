package com.sky.leetcode;

public class Problem344 {
	
	public static void main(String[] args) {
		char s[] = {};
	}

    public void reverseString(char[] s) {
        int i = 0, j = s.length-1;
        char temp;
        while (i < j) {
        	if (s[i] != s[j]) {
        		temp = s[i];
        		s[i] = s[j];
        		s[j] = temp;
        	}
        	i++;
        	j--;
        }
    }
}
