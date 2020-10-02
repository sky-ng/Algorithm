package com.sky.offer;

public class Problem58_2 {
    public String reverseLeftWords(String s, int n) {
    	String x = s.substring(0, n);
    	String y = s.substring(n);
        return y + x;
    }
}
