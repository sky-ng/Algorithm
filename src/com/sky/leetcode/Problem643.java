package com.sky.leetcode;

public class Problem643 {
    public double findMaxAverage(int[] nums, int k) {
    	double ans = Integer.MIN_VALUE;
    	double cnt = 0;
    	for (int i = 0; i < k - 1; ++i) {
    		cnt += nums[i];
    	}
    	for (int i = k - 1; i < nums.length; ++i) {
    		cnt += nums[i];
    		ans = Math.max(ans, cnt);
    		cnt -= nums[i - k + 1];
    	}
    	return ans / k;
    }
    
    public static void main(String[] args) {
    	Problem643 p = new Problem643();
    	int[] nums = {1,12,-5,-6,50,3};
    	System.out.println(p.findMaxAverage(nums, 4));
	}
}
