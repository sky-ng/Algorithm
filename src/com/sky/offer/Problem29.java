package com.sky.offer;

public class Problem29 {
    public int[] spiralOrder(int[][] matrix) {
    	if (matrix == null || matrix.length == 0) return new int[0];
    	int height = matrix.length;
    	int width = matrix[0].length;
    	int[] res = new int[height * width];
    	int up = 0, down = height - 1;
    	int left = 0, right = width - 1;
    	int cnt = 0;
    	while (up <= down && left <= right) {
    		for (int i = left; i <= right; i++) {
    			res[cnt++] = matrix[up][i];
    		}
    		up++;
    		if (up > down) {
    			break;
    		}
    		
    		for (int i = up; i <= down; i++) {
    			res[cnt++] = matrix[i][right];
    		}
    		right--;
    		if (left > right) {
    			break;
    		}
    		
    		for (int i = right; i >= left; i--) {
    			res[cnt++] = matrix[down][i];
    		}
    		down--;
    		for (int i = down; i >= up; i--) {
    			res[cnt++] = matrix[i][left];
    		}
    		left++;
    	}
    	return res;
    }
}
