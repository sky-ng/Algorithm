package com.sky.contest;

import java.util.LinkedList;
import java.util.List;

public class Week_186_3 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
    	List<Integer> list = new LinkedList<>();
    	for (int i = 0; i < nums.size(); i++) {
    		for (int j = 0; j <= i; j++) {
    			if (nums.get(i - j).size() > j) {
    				list.add(nums.get(i - j).get(j));
//    				System.out.println(nums.get(i - j).get(j));
    			}
    		}
    	}
    	for (int i = 1; i < nums.get(nums.size() - 1).size(); i++) {
    		for (int j = nums.size(); j >= nums.get(nums.size() - 1).size(); j--) {
    			if (nums.get(j).size() > nums.get(nums.size() - 1).size() - 1 + i - j) {
    				list.add(nums.get(j).get(nums.size() - 1 + i - j));
//    				System.out.println(nums.get(j).get(nums.size() - 1 + i - j));
    			}
    		}
    	}
    	int[] res = new int[list.size()];
    	for (int i = 0; i < res.length; i++) {
    		res[i] = list.get(i);
    	}
    	return res;
    }
    
    public static void main(String[] args) {
    	Week_186_3 w = new Week_186_3();
    	List<List<Integer>> list = new LinkedList<>();
    	List<Integer> temp1 = new LinkedList<>();
    	temp1.add(1);
    	temp1.add(2);
    	temp1.add(3);
    	temp1.add(4);
    	temp1.add(5);
    	List<Integer> temp2 = new LinkedList<>();
    	temp2.add(6);
    	temp2.add(7);
    	List<Integer> temp3 = new LinkedList<>();
    	temp3.add(8);
    	List<Integer> temp4 = new LinkedList<>();
    	temp4.add(9);
    	temp4.add(10);
    	temp4.add(11);
    	List<Integer> temp5 = new LinkedList<>();
    	temp5.add(12);
    	temp5.add(13);
    	temp5.add(14);
    	temp5.add(15);
    	temp5.add(16);
    	list.add(temp1);
    	list.add(temp2);
    	list.add(temp3);
    	list.add(temp4);
    	list.add(temp5);
    	w.findDiagonalOrder(list);
	}
}
