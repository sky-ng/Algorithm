package com.sky.contest;

import java.util.Arrays;
import java.util.Comparator;

public class Week_189_2 {
    public String arrangeWords(String text) {
    	text = text.toLowerCase();
    	String[] arr = text.split(" ");
    	Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < arr.length - 1; ++i) {
    		sb.append(arr[i]);
    		sb.append(" ");
    	}
    	sb.append(arr[arr.length - 1]);
    	sb.setCharAt(0, (char) (sb.charAt(0) + ('A' - 'a')));
    	String res = sb.toString();
    	return res;
    }
}
