package com.sky.leetcode;

public class Problem53 {
    public int maxSubArray(int[] nums) {
    	int preSum = 0;
    	int ans = nums[0];
    	for (int num : nums) {
    		preSum = Math.max(num, num + preSum);
    		ans = Math.max(ans, preSum);
    	}
    	return ans;
    }

    public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		//[-2, 1, -2, 4, 3, 5, 6, 1, 5]
		System.out.println(new Problem53().maxSubArray(arr));
	}
}
