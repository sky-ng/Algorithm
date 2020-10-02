package com.sky.interview;

public class Problem17_10 {
    public int majorityElement(int[] nums) {
    	int res = -1;
    	int cnt = 0;
    	for (int num : nums) {
    		if (cnt == 0) {
    			res = num;
    			++cnt;
    		} else {
    			if (num == res) {
    				++cnt;
    			} else {
    				--cnt;
    			}
    		}
    	}
    	if (cnt == 0) {
    		return -1;
    	}
    	cnt = 0;
    	for (int num : nums) {
    		if (num == res) ++cnt;
    	}
    	return cnt > (nums.length / 2) ? res : -1;
    }
    
    public static void main(String[] args) {
    	Problem17_10 p = new Problem17_10();
    	int[] nums = {2, 2};
    	int res = p.majorityElement(nums);
    	System.out.println(res);
	}
}
