package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem830 {
    public List<List<Integer>> largeGroupPositions(String S) {
    	List<List<Integer>> result = new ArrayList<>();
    	
    	int len = S.length();
    	int start = 0;
    	int cnt = 1;
    	//前面是否为较大分组
    	boolean flag = false;
    	for (int i = 0; i < len - 1; i++) {
    		if (S.charAt(i) == S.charAt(i + 1)) {
    			cnt++;
    			if (cnt == 3) {
    				flag = true;
    			}
    		} else {
    			if (flag) {
    				List<Integer> list = new ArrayList<>();
    				list.add(start);
    				list.add(start + cnt - 1);
    				result.add(list);
    			}
    			start = i + 1;
    			cnt = 1;
    			flag = false;
    		}
    	}
		if (flag) {
			List<Integer> list = new ArrayList<>();
			list.add(start);
			list.add(start + cnt - 1);
			result.add(list);
		}
        return result;
    }
    
    public static void main(String[] args) {
		System.out.println(new Problem830().largeGroupPositions("abbxxxxzzy"));
	}
}
