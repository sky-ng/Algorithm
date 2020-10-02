package com.sky.leetcode;

public class Problem661 {
    public int[][] imageSmoother(int[][] M) {
    	int row = M.length, col = M[0].length;
    	int[][] ans = new int[row][col];
    	for (int i = 0; i < row; ++i) {
    		for (int j = 0; j < col; ++j) {
    			ans[i][j] = helper(M, i, j, row, col);
    		}
    	}
    	return ans;
    }
    
    private int helper(int[][] M, int i, int j, int row, int col) {
    	int cnt = 1, sum = M[i][j];
    	if (i > 0) {
    		++cnt;
    		sum += M[i - 1][j];
    	}
    	if (i < row - 1) {
    		++cnt;
    		sum += M[i + 1][j];
    	}
    	if (j > 0) {
    		++cnt;
    		sum += M[i][j - 1];
    	}
    	if (j < col - 1) {
    		++cnt;
    		sum += M[i][j + 1];
    	}
    	if (i > 0 && j > 0) {
    		++cnt;
    		sum += M[i - 1][j - 1];
    	}
    	if (i > 0 && j < col - 1) {
    		++cnt;
    		sum += M[i - 1][j + 1];
    	}
    	if (i < row - 1 && j > 0) {
    		++cnt;
    		sum += M[i + 1][j - 1];
    	}
    	if (i < row - 1 && j < col - 1) {
    		++cnt;
    		sum += M[i + 1][j + 1];
    	}
    	return sum / cnt;
    }
}
