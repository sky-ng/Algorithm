package com.sky.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem16_24 {
    public List<List<Integer>> pairSums(int[] nums, int target) {
    	if (nums.length == 0) return new ArrayList<>();
    	Arrays.sort(nums);
    	List<List<Integer>> ans = new ArrayList<>();
    	int i = 0, j = nums.length - 1;
    	while (i < j) {
    		if (target == nums[i] + nums[j]) {
    			List<Integer> temp = new ArrayList<>();
    			temp.add(nums[i++]);
    			temp.add(nums[j--]);
    			ans.add(temp);
    		} else if (target < nums[i] + nums[j]) {
    			--j;
    		} else {
    			++i;
    		}
    	}
    	return ans;
    }
}
