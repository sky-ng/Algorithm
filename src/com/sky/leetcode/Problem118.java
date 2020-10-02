package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) return result;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        result.add(list);
        for (int i = 1; i < numRows; i++) {
        	List<Integer> preRow = result.get(i - 1);
        	List<Integer> curRow = new ArrayList<>();
        	curRow.add(1);
        	for (int j = 1; j < i; j++) {
        		curRow.add(preRow.get(j-1) + preRow.get(j));
        	}
        	curRow.add(1);
        	result.add(curRow);
        }
        return result;
    }
}
