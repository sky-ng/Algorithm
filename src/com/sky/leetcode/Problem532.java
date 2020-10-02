package com.sky.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem532 {
	public int findPairs(int[] nums, int k) {
    	int len = nums.length;
    	if (len <= 1 || k < 0) {
    		return 0;
    	}
    	Arrays.sort(nums);
    	int ans = 0;
    	int slow = 0, fast = 1;
    	Set<Integer> set = new HashSet<>();
    	while (fast < len && slow < len) {
    		if (slow == fast) {
    			fast++;
    			continue;
    		}
    		if ((nums[fast] - nums[slow]) < k) {
    			fast++;
    		} else if ((nums[fast] - nums[slow]) > k) {
    			slow++;
    		} else {
    			if (!set.contains(nums[slow])) {
    				ans++;
    				set.add(nums[slow]);
    			}
				slow++;
				fast++;
    		}
    	}
		return ans;
    }
	
	public static void main(String[] args) {
		int[] arr = {3, 1, 4, 1, 5};
		int k = 0;
		Problem532 p = new Problem532();
		System.out.println(p.findPairs(arr, k));
	}
}
