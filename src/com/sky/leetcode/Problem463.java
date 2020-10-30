package com.sky.leetcode;

public class Problem463 {
	
    public int islandPerimeter(int[][] grid) {
    	if (grid.length == 0 || grid[0].length == 0) return 0;
    	int row = grid.length, col = grid[0].length;
    	int ans = 0;
    	for (int i = 0; i < row; ++i) {
    		for (int j = 0; j < col; ++j) {
    			if (grid[i][j] == 1) {
    				ans += 4;
    				if (i < row - 1 && grid[i + 1][j] == 1) {
    					ans -= 2;
    				}
    				if (j < col - 1 && grid[i][j + 1] == 1) {
    					ans -= 2;
    				}
    			}
    		}
    	}
    	return ans;
    }
}
