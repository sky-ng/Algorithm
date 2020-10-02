package com.sky.leetcode;

public class Problem807 {
	
	//8 4 8 7   8
	//7 4 7 7   7
	//9 4 8 7   9
	//3 3 3 3   3
	
	//9 4 8 7
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int len = grid.length;
        int[] x = new int[len];
        int[] y = new int[len];
        for (int i = 0; i < len; ++i) {
        	int y_max = 0;
        	int x_max = 0;
        	for (int j = 0; j < len; ++j) {
        		y_max = Math.max(y_max, grid[i][j]);
        		x_max = Math.max(x_max, grid[j][i]);
        	}
        	y[i] = y_max;
        	x[i] = x_max;
        }
        int res = 0;
        for (int i = 0; i < len; ++i) {
        	for (int j = 0; j < len; ++j) {
        		res += (Math.min(y[i], x[j]) - grid[i][j]);
        	}
        }
        return res;
    }
}
