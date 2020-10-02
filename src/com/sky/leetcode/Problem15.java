package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
    	if (nums == null || nums.length < 3) return new ArrayList<>();
    	int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for (int m = 1; m < n - 1; ++m) {
        	int l = 0, r = n - 1;
        	while (l < m && r > m) {
        		int i = nums[l], j = nums[m], k = nums[r];
        		if (i + j + k == 0) {
        			List<Integer> list = new ArrayList<>();
        			list.add(i);
        			list.add(j);
        			list.add(k);
        			ans.add(list);
        			++l;
        			--r;
        		} else if (i + j + k < 0) {
        			++l;
        		} else {
        			--r;
        		}
        	}
        }
        List<List<Integer>> finalAns = new ArrayList<>();
        for (List<Integer> l : ans) {
        	finalAns.add(l);
        }
        return finalAns;
    }
    
    public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		List<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(2);
		Set<List<Integer>> set = new HashSet<>();
		set.add(l1);
		set.add(l2);
		System.out.println(set);
	}
}
