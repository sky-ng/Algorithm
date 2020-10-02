package com.sky.leetcode;

public class Problem1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
    	int ans = 0, n = arr.length;
    	int left = n - 1, right = n - 1;
    	int cnt = 0;
    	while (right - left < k - 1) {
    		cnt += arr[left];
    		--left;
    	}
    	while (left >= 0) {
    		cnt += arr[left];
    		if (cnt >= k * threshold) {
    			++ans;
    		}
    		cnt -= arr[right];
    		--left;
    		--right;
    	}
    	return ans;
    }
}
