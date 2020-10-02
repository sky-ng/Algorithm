package com.sky.leetcode;

public class Problem200 {
    public int numIslands(char[][] grid) {
    	if (grid.length == 0 || grid[0].length == 0) {
    		return 0;
    	}
    	int ans = 0;
    	int row = grid.length, col = grid[0].length;
    	for (int i = 0; i < row; ++i) {
        	for (int j = 0; j < col; ++j) {
        		if (grid[i][j] == '1') {
        			dfs(grid, i, j);
        			++ans;
        		}
        	}
    	}
    	return ans;
    }
    
    private void dfs(char[][] grid, int i, int j) {
    	grid[i][j] = '0';
    	//不是第一行，向上深搜
    	if (i > 0 && grid[i - 1][j] == '1') {
    		dfs(grid, i - 1, j);
    	}
    	//不是最后一行,向下深搜
    	if (i < grid.length - 1 && grid[i + 1][j] == '1') {
    		dfs(grid, i + 1, j);
    	}
    	//不是第一列，向左深搜
    	if (j > 0 && grid[i][j - 1] == '1') {
    		dfs(grid, i, j - 1);
    	}
    	
    	//不是最后一列，向右深搜
    	if (j < grid[0].length - 1 && grid[i][j + 1] == '1') {
    		dfs(grid, i, j + 1);
    	}
    }
}
