package com.sky.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week_183_1 {
    public List<Integer> minSubsequence(int[] nums) {
    	Arrays.sort(nums);
    	int sum = 0;
    	for (int i = 0; i < nums.length; i++) {
    		sum += nums[i];
    	}
    	int temp = 0;
    	List<Integer> list = new ArrayList<>();
    	for (int i = nums.length - 1; i >= 0; i--) {
    		temp += nums[i];
    		list.add(nums[i]);
    		if (temp * 2 > sum) {
    			break;
    		}
    	}
    	return list;
    }
    
    public static void main(String[] args) {
		int[] arr = {4,4,7,6,7};
		List<Integer> list = new Week_183_1().minSubsequence(arr);
		System.out.println(list);
	}
}
