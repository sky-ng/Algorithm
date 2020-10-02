package com.sky.leetcode;

public class Problem303 {
	
	public static void main(String[] args) {
		int[] nums = {-2, 0, 3, -5, 2, -1};
		NumArray numArray = new NumArray(nums);
		System.out.println(numArray.sumRange(0, 2));
		System.out.println(numArray.sumRange(2, 5));
		System.out.println(numArray.sumRange(0, 5));
	}
}

class NumArray {

	private int[] opt;
	
    public NumArray(int[] nums) {
    	int len = nums.length;
    	if (len == 0) return;
        opt = new int[len];
        opt[0] = nums[0];
        for (int i = 1; i < len; i++) {
        	opt[i] = nums[i] + opt[i-1];
        }
    }
    
    public int sumRange(int i, int j) {
    	if (i == 0) return opt[j];
    	else return opt[j] - opt[i-1];
    }
}