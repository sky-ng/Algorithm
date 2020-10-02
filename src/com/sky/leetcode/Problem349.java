package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem349 {
	
//    public int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> tempSet = new HashSet<>();
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums1.length; i++) {
//        	tempSet.add(nums1[i]);
//        }
//        for (int i = 0; i < nums2.length; i++) {
//        	if (tempSet.contains(nums2[i])) {
//        		result.add(nums2[i]);
//        		tempSet.remove(nums2[i]);
//        	}
//        }
//        int[] res = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//        	res[i] = result.get(i);
//        }
//        return res;
//    }
	
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num1 : nums1) {
        	set1.add(num1);
        }
        
        for (int num2 : nums2) {
        	set2.add(num2);
        }
        
        set1.retainAll(set2);
        int idx = 0;
        int[] res = new int[set1.size()];
        for (Integer i : set1) {
        	res[idx++] = i;
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9, 4, 9, 8, 4};
		System.out.println(Arrays.toString(new Problem349().intersection(nums1, nums2)));
	}
}
