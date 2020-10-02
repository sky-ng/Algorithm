package com.sky.offer;

import java.util.Stack;

public class Problem39 {
	
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        int res = -1;
        for (int i = 0; i < len; i++) {
        	if (cnt == 0) {
        		res = nums[i];
        		cnt++;
        	} else if (res == nums[i]) {
        		cnt++;
        	} else {
        		cnt--;
        	}
        }
        return res;
    }
}
