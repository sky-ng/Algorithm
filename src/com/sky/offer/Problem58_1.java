package com.sky.offer;

public class Problem58_1 {
    public String reverseWords(String s) {
    	if (s == null) return null;
    	String[] arr = s.split(" ");
    	StringBuilder sb = new StringBuilder();
    	for (int i = arr.length - 1; i >= 0; i--) {
    		if (!"".equals(arr[i])) {
    			sb.append(arr[i] + " ");
    		}
    	}
    	return sb.toString().trim();
    }
    
    public static void main(String[] args) {
		System.out.println(new Problem58_1().reverseWords("   I  am  a teacher!  "));
	}
}
