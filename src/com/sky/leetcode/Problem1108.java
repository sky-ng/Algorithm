package com.sky.leetcode;

public class Problem1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    
    public static void main(String[] args) {
		String s = "255.100.50.0";
		System.out.println(new Problem1108().defangIPaddr(s));
	}
}
