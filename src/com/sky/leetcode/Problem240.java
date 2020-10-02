package com.sky.leetcode;

public class Problem240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) 
        	return false;
        int row = matrix.length, col = matrix[0].length;
        for (int i = 0, j = col - 1; i < row && j >= 0; ) {
        	if (target == matrix[i][j]) {
        		return true;
        	} else if (target > matrix[i][j]) {
        		i++;
        	} else {
        		j--;
        	}
        }
        return false;
    }
}
