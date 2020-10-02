package com.sky.leetcode;

public class Problem209 {
    public int minSubArrayLen(int s, int[] nums) {
    	int n = nums.length;
    	if (n == 0) {
    		return 0;
    	}
    	int ans = Integer.MAX_VALUE;
    	int start = 0, end = 0;
    	int cnt = 0;
    	cnt += nums[end];
    	while (end < n) {
    		if (cnt < s) {
    			++end;
    			if (end < n) {
    				cnt += nums[end];
    			}
    		} else {
    			ans = Math.min(ans, end - start + 1);
    			cnt -= nums[start];
    			++start;
    		}
    	}
    	return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
