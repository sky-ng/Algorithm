package com.sky.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Problem496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nums1Size = nums1.length;
        int nums2Size = nums2.length;
        int[] res = new int[nums1Size];
        if (nums1Size == 0) {
        	return res;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        map.put(nums2[nums2Size - 1], -1);
    	for (int i = 0;i < nums2Size - 1; i++) {
    		if (nums2[i] < nums2[i + 1]) {
    			map.put(nums2[i], nums2[i + 1]);
    			while (!stack.empty() && stack.peek() < nums2[i + 1]) {
    				map.put(stack.pop(), nums2[i + 1]);
    			}
    		} else {
    			stack.push(nums2[i]);
    		}
    	}
    	while (!stack.empty()) {
    		map.put(stack.pop(), -1);
    	}
    	for (int i = 0; i < nums1Size; i++) {
    		res[i] = map.get(nums1[i]);
    	}
    	return res;
    }
    
    public static void main(String[] args) {
		int[] nums1 = {2, 4};
		int[] nums2 = {1, 2, 3, 4};
		System.out.println(Arrays.toString(new Problem496().nextGreaterElement(nums1, nums2)));
	}
}
