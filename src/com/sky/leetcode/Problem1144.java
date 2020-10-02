package com.sky.leetcode;

import java.util.Arrays;

public class Problem1144 {
    public int movesToMakeZigzag(int[] nums) {
    	//至少三个数才谈得上锯齿数组
    	if (nums.length <= 2) return 0;
    	return Math.min(caseOne(nums), caseTwo(nums));
    }
    
    //偶数索引对应的元素都大于相邻的元素
    private int caseOne(int[] nums) {
    	int[] newArr = Arrays.copyOf(nums, nums.length);
    	int ans = 0;
    	for (int i = 1; i < newArr.length; i += 2) {
    		while (newArr[i] >= newArr[i - 1] || ((i + 1 < newArr.length) && newArr[i] >= newArr[i + 1])) {
    			++ans;
    			--newArr[i];
    		}
    	}
    	return ans;
    }
    
    //奇数索引对应的元素都大于相邻的元素
    private int caseTwo(int[] nums) {
    	int[] newArr = Arrays.copyOf(nums, nums.length);
    	int ans = 0;
    	for (int i = 0; i < newArr.length; i += 2) {
    		while (((i - 1 >= 0) && newArr[i] >= newArr[i - 1]) || ((i + 1 < newArr.length) && newArr[i] >= newArr[i + 1])) {
    			++ans;
    			--newArr[i];
    		}
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
    	Problem1144 p = new Problem1144();
    	int[] nums = {99,6,1,6,2};
    	System.out.println(p.movesToMakeZigzag(nums));
	}
}
