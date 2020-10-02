package com.sky.leetcode;

public class Problem64 {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] arr = new int[row][col];
        arr[0][0] = grid[0][0];
        for (int i = 1; i < col; i++) {
        	arr[0][i] = arr[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
        	arr[i][0] = arr[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < row; i++) {
        	for (int j = 1; j < col; j++) {
        		arr[i][j] = grid[i][j] + Math.min(arr[i -1][j], arr[i][j - 1]);
        	}
        }
    	return arr[row - 1][col - 1];
    }
}
