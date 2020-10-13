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
    	for (int i = 0; i < n - 3; ++i) {
    		if (i > 0 && nums[i] == nums[i - 1]) continue;
    		for (int j = i + 1; j < n - 2; ++j) {
    			if (j > i + 1 && nums[j] == nums[j - 1]) continue;
    			int L = j + 1, R = n - 1;
    			while (L < R) {
    				int sum = nums[i] + nums[j] + nums[L] + nums[R];
    				if (target == sum) {
    					List<Integer> list = new ArrayList<>();
    					list.add(nums[i]);
    					list.add(nums[j]);
    					list.add(nums[L]);
    					list.add(nums[R]);
    					ans.add(list);
    					while (L < R && nums[L] == nums[L + 1]) ++L;
    					while (L < R && nums[R] == nums[R - 1]) --R;
    					++L;
    					--R;
    				} else if (target < sum) {
    					--R;
    				} else {
    					++L;
    				}
    			}
    		}
    	}
    	return ans;
    }
}
