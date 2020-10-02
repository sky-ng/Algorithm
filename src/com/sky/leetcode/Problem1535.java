package com.sky.leetcode;

public class Problem1535 {
    public int getWinner(int[] arr, int k) {
    	int max = -0x3f3f3f3f;
    	for (int num : arr) max = Math.max(max, num);
    	int len = arr.length;
    	if (k >= len - 1) return max;
    	int idx = 0;
    	for (int i = 1; i < len; ++i) {
    		if (arr[idx] < arr[i]) {
    			if (i - idx - 1 >= k) return arr[idx];
    			else {
    				idx = i;
    				break;
    			}
    		}
    	}
    	for (int i = idx + 1; i < len; ++i) {
    		if (arr[idx] < arr[i]) {
    			if (i - idx >= k) return arr[idx];
    			else {
    				idx = i;
    			}
    		}
    	}
    	return max;
    }
    
    public static void main(String[] args) {
    	Problem1535 p = new Problem1535();
    	System.out.println(p.getWinner(new int[] {2,1,3,5,4,6,7}, 2));
    	System.out.println(p.getWinner(new int[] {3,2,1}, 10));
    	System.out.println(p.getWinner(new int[] {1,9,8,2,3,7,6,4,5}, 7));
    	System.out.println(p.getWinner(new int[] {1,11,22,33,44,55,66,77,88,99}, 1000000000));
	}
}
