package com.sky.offer;

import java.util.Arrays;

public class Problem61 {
    public boolean isStraight(int[] nums) {
    	Arrays.sort(nums);
    	int zero = 0;
    	for (int i = 0; i < 4; i++) {
    		if (nums[i] == 0) {
    			zero++;
    			continue;
    		}
    		if (nums[i] == nums[i + 1]) {
    			return false;
    		}
    		zero -= nums[i + 1] - nums[i] - 1;
    	}
    	return zero >= 0 ? true : false;
    }
}
