package com.sky.leetcode;

public class Problem215 {
    public int findKthLargest(int[] nums, int k) {
    	search(nums, 0, nums.length - 1, k);
    	return nums[k - 1];
    }
    
    private void search(int[] nums, int s, int e, int target) {
    	if (s >= e) return;
    	int k = nums[s];
    	int i = s, j = e;
    	while (i != j) {
    		while (i < j && nums[j] <= k) {
    			--j;
    		}
    		swap(nums, i, j);
    		while (i < j && nums[i] >= k) {
    			++i;
    		}
    		swap(nums, i, j);
    	}
    	if (i == (target - 1)) {
    		return;
    	} else if (i < (target - 1)) {
    		search(nums, i + 1, e, target);
    	} else {
    		search(nums, s, i - 1, target);
    	}
    }
    
    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
