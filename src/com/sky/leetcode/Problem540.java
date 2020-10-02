package com.sky.leetcode;

public class Problem540 {
    public int singleNonDuplicate(int[] nums) {
    	int len = nums.length - 3;
    	for (int i = 0; i <= len; i += 2) {
    		if (nums[i] != nums[i + 1]) {
    			return nums[i];
    		}
    	}
    	return nums[nums.length - 1];
    }
    
    public static void main(String[] args) {
    	//2
		System.out.println(new Problem540().singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
		//10
		System.out.println(new Problem540().singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
		//11
		System.out.println(new Problem540().singleNonDuplicate(new int[] {3,3,7,7,10,10,11}));
	}
}
