package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> preRow = new ArrayList<>();
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
    	for (int i = 1; i <= rowIndex; i++) {
    		preRow.clear();
    		preRow.addAll(currentRow);
    		currentRow.clear();
    		currentRow.add(1);
    		for (int j = 1; j < i; j++) {
    			currentRow.add(preRow.get(j - 1) + preRow.get(j));
    		}
    		currentRow.add(1);
    	}
    	return currentRow;
    }
    
    public static void main(String[] args) {
    	Problem119 p = new Problem119();
    	System.out.println(p.getRow(0));
    	System.out.println(p.getRow(1));
    	System.out.println(p.getRow(2));
    	System.out.println(p.getRow(3));
    	System.out.println(p.getRow(4));
    	System.out.println(p.getRow(5));
    	System.out.println(p.getRow(6));
    	
    	
	}
}
