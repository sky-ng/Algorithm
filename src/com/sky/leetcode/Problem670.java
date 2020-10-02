package com.sky.leetcode;

public class Problem670 {
    public int maximumSwap(int num) {
    	char[] num_arr = String.valueOf(num).toCharArray();
    	int n = num_arr.length;
    	int[] idx_arr = new int[n];
    	int max_num = Integer.MIN_VALUE;
    	for (int i = n - 1; i >= 0; --i) {
    		if (num_arr[i] - '0' > max_num) {
    			idx_arr[i] = i;
    			max_num = num_arr[i] - '0';
    		} else {
    			idx_arr[i] = idx_arr[i + 1];
    		}
    	}
    	for (int i = 0; i < n; ++i) {
    		if (num_arr[i] < num_arr[idx_arr[i]]) {
    			char t = num_arr[i];
    			num_arr[i] = num_arr[idx_arr[i]];
    			num_arr[idx_arr[i]] = t;
    			break;
    		}
    	}
    	return Integer.parseInt(String.valueOf(num_arr));
    }
    
    public static void main(String[] args) {
		
	}
}
