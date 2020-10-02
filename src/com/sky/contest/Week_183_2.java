package com.sky.contest;

public class Week_183_2 {
    public int numSteps(String s) {
    	int step = 0;
    	while (!"1".equals(s)) {
    		if (s.charAt(s.length() - 1) == '0') {
    			s = s.substring(0, s.length() - 1);
    		} else {
    			char[] ch = s.toCharArray();
    			boolean flag = true;
    			for (int i = ch.length - 1; i >= 0; i--) {
    				if (ch[i] == '1') {
    					ch[i] = '0';
    				} else {
    					ch[i] = '1';
    					flag = false;
    					break;
    				}
    			}
    			if (flag) {
    				s = "1" + String.valueOf(ch);
    			} else {
    				s = String.valueOf(ch);
    			}
    		}
    		step++;
    	}
    	return step;
    }
    
    public static void main(String[] args) {
    	System.out.println(new Week_183_2().numSteps("1"));
	}
}
