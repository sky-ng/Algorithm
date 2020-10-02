package com.sky.contest;

public class Week_186_1 {
    public int maxScore(String s) {
    	int max = Integer.MIN_VALUE;
    	char[] chs = s.toCharArray();
    	for (int i = 1; i <= chs.length - 1; i++) {
    		int cnt = 0;
    		for (int j = 0; j < i; j++) {
    			if (chs[j] == '0') {
    				cnt++;
    			}
    		}
    		for (int j = i; j < chs.length; j++) {
    			if (chs[j] == '1') {
    				cnt++;
    			}
    		}
    		if (max < cnt) {
    			max = cnt;
    		}
    	}
    	return max;
    }
    
    public static void main(String[] args) {
		String s = "0101";
		System.out.println(new Week_186_1().maxScore(s));
	}
}
