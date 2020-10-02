package com.sky.leetcode;

public class Problem463 {
    public int islandPerimeter(int[][] grid) {
    	if (grid.length == 0 || grid[0].length == 0) return 0;
    	int landNum = 0, adjacentLand = 0;
    	int row = grid.length, col = grid[0].length;
    	for (int i = 0; i < grid.length; ++i) {
    		for (int j = 0; j < grid[0].length; ++j) {
    			if (grid[i][j] == 1) {
    				++landNum;
    				adjacentLand += helper(grid, i, j, row, col);
    			}
    		}
    	}
    	return 4 * landNum - adjacentLand;
    }
    
    //返回某个陆地周围的岛屿数量
    private int helper(int[][] grid, int i, int j, int row, int col) {
    	int ans = 0;
    	if (i - 1 >= 0 && grid[i - 1][j] == 1) ++ans;
    	if (i + 1 < row && grid[i + 1][j] == 1) ++ans;
    	if (j - 1 >= 0 && grid[i][j - 1] == 1) ++ans;
    	if (j + 1 < col && grid[i][j + 1] == 1) ++ans;
    	return ans;
    }
}
