package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> ans = new ArrayList<>();
    	if (nums == null || nums.length < 4) return ans;
    	Arrays.sort(nums);
    	int n = nums.length;
    	for (int idx2 = 1; idx2 < n - 2; ++idx2) {
    		for (int idx3 = idx2 + 1; idx3 < n - 1; ++idx3) {
    			int idx1 = 0;
    			int idx4 = n - 1;
    			while (idx1 < idx2 && idx3 < idx4) {
    				int sum = nums[idx1] + nums[idx2] + nums[idx3] + nums[idx4];
    				if (sum == target) {
    					List<Integer> list = new ArrayList<>();
    					list.add(nums[idx1]);
    					list.add(nums[idx2]);
    					list.add(nums[idx3]);
    					list.add(nums[idx4]);
    					if (ans.contains(list)) {
    						ans.add(list);
    					}
    					++idx1;
    					--idx4;
    				} else if (sum < target) {
    					++idx1;
    				} else {
    					--idx4;
    				}
    			}
    		}
    	}
    	return ans;
    }
}
