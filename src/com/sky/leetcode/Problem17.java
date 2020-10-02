package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {
    public List<String> letterCombinations(String digits) {
    	if (digits == null || digits.length() == 0) return new ArrayList<>();
    	List<StringBuilder> list = new ArrayList<>();
    	list.add(new StringBuilder());
    	for (char d : digits.toCharArray()) {
    		int n = list.size();
    		char[] ch = helper(d - '0');
    		for (int i = 1; i < ch.length; ++i) {
    			for (int j = 0; j < n; ++j) {
    				list.add(new StringBuilder(list.get(j)));
    			}
    		}
    		for (int i = 0; i < ch.length; ++i) {
    			for (int j = 0; j < n; ++j) {
    				list.get(i * n + j).append(ch[i]);
    			}
    		}
    	}
    	List<String> ans = new ArrayList<>();
    	for (StringBuilder sb : list) {
    		ans.add(sb.toString());
    	}
    	return ans;
    }
    
    private char[] helper(int digit) {
    	char[] ch = null;
    	switch (digit) {
		case 2:
			ch = new char[]{'a', 'b', 'c'};
			break;
		case 3:
			ch = new char[]{'d', 'e', 'f'};
			break;
		case 4:
			ch = new char[]{'g', 'h', 'i'};
			break;
		case 5:
			ch = new char[]{'j', 'k', 'l'};
			break;
		case 6:
			ch = new char[]{'m', 'n', 'o'};
			break;
		case 7:
			ch = new char[]{'p', 'q', 'r', 's'};
			break;
		case 8:
			ch = new char[]{'t', 'u', 'v'};
			break;
		default:
			ch = new char[]{'w', 'x', 'y', 'z'};
			break;
		}
    	return ch;
    }
    
    public static void main(String[] args) {
    	
	}
}
