package com.sky.interview;

public class Problem10_09 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if (matrix.length == 0 || matrix[0].length == 0) {
    		return false;
    	}
    	int row = matrix.length, col = matrix[0].length;
    	int cur_row = 0, cur_col = col - 1;
    	while (cur_col >= 0 && cur_row < row) {
    		int num = matrix[cur_row][cur_col];
    		if (num < target) {
    			++cur_row;
    		} else if (num > target) {
    			--cur_col;
    		} else {
    			return true;
    		}
    	}
    	return false;
    }
}
