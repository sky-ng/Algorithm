package com.sky.leetcode;

public class Problem695 {
	
    public int maxAreaOfIsland(int[][] grid) {
    	int row = grid.length, col = grid[0].length;
    	int max = 0;
    	for (int i = 0; i < row; ++i) {
    		for (int j = 0; j < col; ++j) {
    			if (grid[i][j] == 1) {
    				max = Math.max(max, dfs(grid, i, j, row, col));
    			}
    		}
    	}
    	return max;
    }
    
    private int dfs(int[][] grid, int i, int j, int row, int col) {
    	if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == 0) {
    		return 0;
    	}
    	int cnt = 1;
    	grid[i][j] = 0;
    	cnt += dfs(grid, i + 1, j, row, col);
    	cnt += dfs(grid, i - 1, j, row, col);
    	cnt += dfs(grid, i, j + 1, row, col);
    	cnt += dfs(grid, i, j - 1, row, col);
    	return cnt;
    }
    
    public static void main(String[] args) {
		int[][] grid = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
		Problem695 p = new Problem695();
		System.out.println(p.maxAreaOfIsland(grid));
	}
}
