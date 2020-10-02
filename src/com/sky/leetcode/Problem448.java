package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
        	nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] > 0) {
        		ans.add(i + 1);
        	}
        }
    	return ans;
    }
}
