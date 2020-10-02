package com.sky.leetcode;

public class Problem33 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }
    
    private int binarySearch(int[] nums, int l, int r, int target) {
    	if (l > r) return -1;
    	int mid = l + ((r - l) >> 1);
    	if (nums[mid] == target) {
    		return mid;
    	}
    	if (nums[l] == target) {
    		return l;
    	}
    	if (nums[r] == target) {
    		return r;
    	}
    	//左边有序
    	if (nums[l] < nums[mid]) {
    		if (target > nums[l] && target < nums[mid]) {
    			return binarySearch(nums, l, mid - 1, target);
    		} else {
    			return binarySearch(nums, mid + 1, r, target);
    		}
    	} else { //右边有序
    		if (target > nums[mid] && target < nums[r]) {
    			return binarySearch(nums, mid + 1, r, target);
    		} else {
    			return binarySearch(nums, l, mid - 1, target);
    		}
    	}
    }
    
    public static void main(String[] args) {
		int[] nums = {4, 5, 6, 7, 8, 1, 2, 3};
		int target = 8;
		Problem33 p = new Problem33();
		int ans = p.search(nums, target);
		System.out.println(ans);
	}
}
