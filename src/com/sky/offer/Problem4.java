package com.sky.offer;

public class Problem4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
    	int row = matrix.length;
    	int col = matrix[0].length;
    	int curRow = 0, curCol = col - 1;
    	while (curRow < row && curCol >= 0) {
    		if (matrix[curRow][curCol] > target) {
    			curCol--;
    		} else if (matrix[curRow][curCol] < target) {
    			curRow++;
    		} else {
    			return true;
    		}
    	}
    	return false;
    }
}
