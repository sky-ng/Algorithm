package com.sky.leetcode;

import java.util.Arrays;

public class Problem31 {
	
	private int tmp = 0;
	private int s = 0, e = 0;
	
    public void nextPermutation(int[] nums) {
    	boolean flag = true;
    	for (int i = nums.length - 1; i > 0; --i) {
    		if (nums[i] > nums[i - 1]) {
    			for (int j = nums.length - 1; j >= i; --j) {
    				if (nums[j] > nums[i - 1]) {
    					swap(nums, j, i - 1);
    					break;
    				}
    			}
    			s = i;
    			e = nums.length - 1;
    			while (s < e) {
    				swap(nums, s, e);
    				++s;
    				--e;
    			}
    			flag = false;
    			break;
    		}
    	}
    	if (flag) {
    		s = 0;
    		e = nums.length - 1;
			while (s < e) {
				swap(nums, s, e);
				++s;
				--e;
			}
    	}
    }
    
    private void swap(int[] nums, int i, int j) {
		tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
    }
    
    public static void main(String[] args) {
		int[] nums = {1, 3, 2};
		new Problem31().nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}
}
