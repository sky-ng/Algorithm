package com.sky.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem468 {
    public String validIPAddress(String IP) {
    	if (IP.contains(".") && !IP.startsWith("\\.") && !IP.endsWith(".")) {
    		String[] nums = IP.split("\\.");
    		if (nums.length == 4) {
    			for (String num : nums) {
    				if (!judgeIPv4(num)) {
    					return "Neither";
    				}
    			}
    			return "IPv4";
    		}
    	} else if (IP.contains(":") && !IP.startsWith(":") && !IP.endsWith(":")) {
    		String[] nums = IP.split(":");
    		if (nums.length == 8) {
    			for (String num : nums) {
    				if (!judgeIPv6(num)) {
    					return "Neither";
    				}
    			}
    			return "IPv6";
    		}
    	}
    	return "Neither";
    }
    
    private boolean judgeIPv4(String num) {
    	String pattern = "\\d{1,3}";
    	Pattern r = Pattern.compile(pattern);
    	Matcher m = r.matcher(num);
    	if (m.matches()) {
    		if (num.length() != 1 && num.charAt(0) == '0') return false;
    		int i = Integer.valueOf(num);
    		if (i >= 0 && i <= 255) return true;
    	}
    	return false;
    }
    
    private boolean judgeIPv6(String num) {
    	String pattern = "([0-9]|[a-f]|[A-F]){1,4}";
    	Pattern r = Pattern.compile(pattern);
    	Matcher m = r.matcher(num);
    	if (m.matches()) {
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    	Problem468 p = new Problem468();
    	System.out.println(p.validIPAddress("256.256.256.256"));
    	
//    	String s = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
//    	String s = "12.12.12.12.";
//    	System.out.println(s.endsWith("."));
	}
}
