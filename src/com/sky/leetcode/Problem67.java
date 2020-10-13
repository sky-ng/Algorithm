package com.sky.leetcode;

public class Problem67 {
    public String addBinary(String a, String b) {
        char[] a_str = new StringBuilder(a).reverse().toString().toCharArray();
        char[] b_str = new StringBuilder(b).reverse().toString().toCharArray();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        int pA = 0, pB = 0;
        while (pA < a_str.length && pB < b_str.length) {
        	if (a_str[pA] == '1' && b_str[pB] == '1') {
        		sb.append(flag ? "1" : "0");
        		flag = true;
        	} else if (a_str[pA] == '0' && b_str[pB] == '0') {
        		sb.append(flag ? "1" : "0");
        		flag = false;
        	} else {
        		sb.append(flag ? "0" : "1");
        	}
        	pA++;
        	pB++;
        }
        while (pA < a_str.length) {
        	if (a_str[pA] == '1') {
        		sb.append(flag ? "0" : "1");
        	} else {
        		sb.append(flag ? "1" : "0");
        		flag = false;
        	}
        	pA++;
        }
        while (pB < b_str.length) {
        	if (b_str[pB] == '1') {
        		sb.append(flag ? "0" : "1");
        	} else {
        		sb.append(flag ? "1" : "0");
        		flag = false;
        	}
        	pA++;
        	pB++;
        }
        if (flag) sb.append("1");
        return sb.reverse().toString();
    }
}
