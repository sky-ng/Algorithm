package com.sky.leetcode;

public class Problem557 {
	public static void main(String[] args) {
		String s = new Problem557().reverseWords("Let's");
		System.out.println(s);
	}
	
    public String reverseWords(String s) {
    	StringBuilder sb = new StringBuilder(s);
    	sb.reverse();
    	String[] wordList = sb.toString().split(" ");
    	sb = new StringBuilder();
    	for (int i = wordList.length-1; i > 0; i--) {
    		sb.append(wordList[i]);
    		sb.append(" ");
    	}
    	sb.append(wordList[0]);
    	return sb.toString();
    }
}
