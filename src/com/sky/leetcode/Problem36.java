package com.sky.leetcode;

public class Problem36 {
    public boolean isValidSudoku(char[][] board) {
    	//判断行列是否符合要求
    	for (int i = 0; i < 9; ++i) {
    		int[] row = new int[9];
    		int[] col = new int[9];
    		for (int j = 0; j < 9; ++j) {
    			if (board[i][j] != '.') {
    				if (row[board[i][j] - '1'] != 0) return false;
    				++row[board[i][j] - '1'];
    			}
    			if (board[j][i] != '.') {
    				if (col[board[j][i] - '1'] != 0) return false;
    				++col[board[j][i] - '1'];
    			}
    		}
    	}
    	//判断9宫格是否符合要求
    	for (int i = 0; i <= 6; i += 3) {
    		for (int j = 0; j <= 6; j += 3) {
    			int[] num = new int[9];
    			for (int p = i; p < i + 3; ++p) {
    				for (int q = j; q < j + 3; ++q) {
    					if (board[p][q] != '.') {
    						if (num[board[p][q] - '1'] != 0) return false;
    						++num[board[p][q] - '1'];
    					}
    				}
    			}
    		}
    	}
    	return true;
    }
}
