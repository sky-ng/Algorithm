package com.sky.leetcode;

public class Problem130 {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) {
        	return;
        }
        int row = board.length, col = board[0].length;
        for (int i = 0; i < col; ++i) {
        	if (board[0][i] == 'O') {
        		dfs(board, 0, i, row, col);
        	}
        	if (board[row - 1][i] == 'O') {
        		dfs(board, row - 1, i, row, col);
        	}
        }
        for (int i = 0; i < row; ++i) {
        	if (board[i][0] == 'O') {
        		dfs(board, i, 0, row, col);
        	}
        	if (board[i][col - 1] == 'O') {
        		dfs(board, i, col - 1, row, col);
        	}
        }
        for (int i = 0; i < row; ++i) {
        	for (int j = 0; j < col; ++j) {
        		if (board[i][j] == 'O') {
        			board[i][j] = 'X';
        		}
        		if (board[i][j] == 'P') {
        			board[i][j] = 'O';
        		}
        	}
        }
    }
    
    private void dfs(char[][] board, int i, int j, int row, int col) {
    	if (i < 0 || i >= row || j < 0 || j >= col) {
    		return;
    	}
    	board[i][j] = 'P';
    	if (i - 1 >= 0 && board[i - 1][j] == 'O') {
    		dfs(board, i - 1, j, row, col);
    	}
    	if (i + 1 < col && board[i + 1][j] == 'O') {
    		dfs(board, i + 1, j, row, col);
    	}
    	if (j - 1 >= 0 && board[i][j - 1] == 'O') {
    		dfs(board, i, j - 1, row, col);
    	}
    	if (j + 1 < row && board[i][j + 1] == 'O') {
    		dfs(board, i, j + 1, row, col);
    	}
    }
}
