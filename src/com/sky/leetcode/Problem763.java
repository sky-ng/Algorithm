package com.sky.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Problem763 {
    public List<Integer> partitionLabels(String S) {
        List<String> strList = new LinkedList<>();
        boolean[] isShown = new boolean[26];
        int len = S.length();
        for (int i = 0; i < len; i++) {
        	char curCh = S.charAt(i);
        	if (!isShown[curCh - 'a']) {
        		isShown[curCh - 'a'] = true;
        		strList.add(String.valueOf(curCh));
        	} else {
        		String curStr = String.valueOf(curCh);
        		int cnt = strList.size() - 1;
        		String temp = null;
        		while (cnt >= 0) {
        			temp = strList.remove(cnt);
        			if (temp.indexOf(curCh) != -1) {
        				temp = temp + curStr;
        				break;
        			} else {
        				curStr = temp + curStr;
        			}
        			cnt--;
        		}
        		strList.add(temp);
        	}
        }
        List<Integer> res = new LinkedList<>();
        for (String str : strList) {
        	res.add(str.length());
        }
    	return res;
    }
    
    public static void main(String[] args) {
    	String s = "ababcbacadefegdehijhklij";
    	System.out.println(new Problem763().partitionLabels(s));
	}
}
