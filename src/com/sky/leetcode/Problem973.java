package com.sky.leetcode;

public class Problem973 {
    public int[][] kClosest(int[][] points, int K) {
    	int len = points.length;
    	int[] distance = new int[len];
    	for (int i = 0; i < len; i++) {
    		int x = points[i][0], y = points[i][1];
    		distance[i] =  x * x + y * y;
    	}
    	search(distance, 0, len - 1, K - 1);
    	int[][] res = new int[K][2];
    	for (int i = 0, j = 0; i < len; i++) {
    		int x = points[i][0], y = points[i][1];
    		if (distance[K - 1] >= (x * x + y * y)) {
    			res[j][0] = x;
    			res[j][1] = y;
    			j++;
    		}
    	}
    	return res;
    }
    
    private void search(int[] arr, int s, int e, int k) {
    	if (s >= e) return;
    	int p = arr[s];
    	int i = s, j = e;
    	while (i != j) {
    		while (i < j && arr[j] >= p) {
    			--j;
    		}
    		swap(arr, i, j);
    		while (i < j && arr[i] <= p) {
    			++i;
    		}
    		swap(arr, i, j);
    	}
    	if (i == k) {
    		return;
    	} else if (i < k) {
    		search(arr, i + 1, e, k);
    	} else {
    		search(arr, s, i - 1, k);
    	}
    }
    
    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
