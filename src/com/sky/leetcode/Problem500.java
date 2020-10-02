package com.sky.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Problem500 {
	
	public static void main(String[] args) {
		String words[] = {"Hello", "Alaska", "Dad", "Peace"};
		String[] w = new Problem500().findWords(words);
		for (int i =0; i < w.length; i++) {
			System.out.println(w[i]);
		}
	}
	
    public String[] findWords(String[] words) {
    	String s[] = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> list = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
        	String temp = words[i].toLowerCase();
        	int index = 0;
        	for (int j = 0; j < 3; j++) {
        		if (s[j].contains(String.valueOf(temp.charAt(0)))) {
        			index = j;
        			break;
        		}
        	}
        	boolean flag = false;
        	for (int j = 1; j < temp.length(); j++) {
        		if (!s[index].contains(String.valueOf(temp.charAt(j)))) {
        			flag = true;
        			break;
        		}
        	}
        	if (flag == false) {
        		list.add(words[i]);
        	}
        }
    	return list.toArray(new String[list.size()]);
    }
}
