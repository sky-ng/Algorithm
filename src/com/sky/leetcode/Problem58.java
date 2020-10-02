package com.sky.leetcode;

public class Problem58 {
    public int lengthOfLastWord(String s) {
    	char[] ch = s.toCharArray();
    	boolean flag = false;
    	int num = 0;
    	for (int i = ch.length - 1; i >= 0; i--) {
    		if (ch[i] != ' ') {
    			flag = true;
    		}
    		if (flag && ch[i] == ' ') {
    			return num;
    		}
    		if (flag) {
    			num++;
    		}
    	}
    	return num;
    }
    
    public static void main(String[] args) {
    	Problem58 p = new Problem58();
    	System.out.println(p.lengthOfLastWord("Hello "));
	}
}
