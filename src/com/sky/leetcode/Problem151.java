package com.sky.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem151 {
    public String reverseWords(String s) {
    	int beginIdx = 0, endIdx = s.length() - 1;
    	while (beginIdx <= endIdx && s.charAt(beginIdx) == ' ') ++beginIdx;
    	while (beginIdx <= endIdx && s.charAt(endIdx) == ' ') --endIdx;
    	Deque<String> deque = new ArrayDeque<>();
    	StringBuilder sb = new StringBuilder();
    	while (beginIdx <= endIdx) {
    		char c = s.charAt(beginIdx);
    		if (c == ' ' && sb.length() != 0) {
    			deque.addFirst(sb.toString());
    			sb.setLength(0);
    		} else if (c != ' ') {
    			sb.append(c);
    		}
    		++beginIdx;
    	}
    	deque.addFirst(sb.toString());
    	return String.join(" ", deque);
    }
}
