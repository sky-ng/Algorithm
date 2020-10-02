package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem784 {
    public List<String> letterCasePermutation(String S) {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder(""));
        for (char c : S.toCharArray()) {
        	int n = list.size();
        	if (c >= '0' && c <= '9') {
        		for (int i = 0; i < n; ++i) {
        			list.get(i).append(c);
        		}
        	} else {
        		for (int i = 0; i < n; ++i) {
        			list.add(new StringBuilder(list.get(i)));
        			list.get(i).append(Character.toLowerCase(c));
        			list.get(n + i).append(Character.toUpperCase(c));
        		}
        	}
        }
        List<String> ans = new ArrayList<>();
        for (StringBuilder sb : list) {
        	ans.add(sb.toString());
        }
        return ans;
    }
}
