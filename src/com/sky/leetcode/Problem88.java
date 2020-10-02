package com.sky.leetcode;

public class Problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int last = m + n - 1;
    	int cur1 = m - 1, cur2 = n - 1;
    	while (cur1 >= 0 && cur2 >= 0) {
    		if (nums1[cur1] < nums2[cur2]) {
    			nums1[last--] = nums2[cur2--];
    		} else {
    			nums1[last--] = nums1[cur1--];
    		}
    	}
    	while (cur2 >= 0) {
    		nums1[last--] = nums2[cur2--];
    	}
    }
}
