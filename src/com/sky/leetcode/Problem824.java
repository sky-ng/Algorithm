package com.sky.leetcode;

public class Problem824 {
    public String toGoatLatin(String S) {
        int len = S.length();
        StringBuilder sb = new StringBuilder();
        boolean beginOfWord = true;
        boolean vowelFlag = false;
        int cnt = 1;
        char begin = 'A';
        for (int i = 0; i < len; i++) {
        	if (S.charAt(i) == ' ') {
        		if (!vowelFlag) {
        			sb.append(begin);
        		}
        		sb.append("ma");
        		for (int j = 0; j < cnt; j++) {
        			sb.append("a");
        		}
        		cnt++;
        		sb.append(" ");
        		beginOfWord = true;
        		continue;
        	}
        	if (beginOfWord) {
        		if (isVowel(S.charAt(i))) {
        			vowelFlag = true;
            		sb.append(S.charAt(i));
        		} else {
        			vowelFlag = false;
        			begin = S.charAt(i);
        		}
    			beginOfWord = false;
    			continue;
        	}
        	sb.append(S.charAt(i));
        }
		if (!vowelFlag) {
			sb.append(begin);
		}
		sb.append("ma");
		for (int j = 0; j < cnt; j++) {
			sb.append("a");
		}
		return sb.toString();
    }
    
    private boolean isVowel(char i) {
    	if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
		String s = "I speak Goat Latin";
		System.out.println(new Problem824().toGoatLatin(s));
	}
}
