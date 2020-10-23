package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem1441 {
    public List<String> buildArray(int[] target, int n) {
    	List<String> res = new ArrayList<>();
    	int cnt = target.length;
    	int num = 1;
    	for (int i = 0; i < cnt; ++i) {
    		res.add("Push");
    		if (num != target[i]) {
    			res.add("Pop");
    			--i;
    		}
    		++num;
    	}
    	return res;
    }
}
