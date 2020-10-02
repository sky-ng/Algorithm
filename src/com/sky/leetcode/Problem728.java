package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
    	List<Integer> list = new ArrayList<>();
    	for (int i = left; i <= right; i++) {
    		if (F(i)) {
    			list.add(i);
    		}
    	}
        return list;
    }
    private boolean F(int i) {
    	int temp = i;
    	while (temp != 0) {
    		int tail = temp % 10;
    		if (tail == 0) {
    			return false;
    		}
    		if (i % tail != 0) {
    			return false;
    		}
    		temp /= 10;
    	}
    	return true;
    }
}