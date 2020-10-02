package com.sky.leetcode;

public class Problem79 {
    public boolean exist(char[][] board, String word) {
    	int m = board.length;
    	int n = board[0].length;
    	char[] str = word.toCharArray();
    	boolean[][] isVisited = new boolean[m][n];
    	for (int i = 0; i < m; ++i) {
    		for (int j = 0; j < n; ++j) {
    			if (dfs(board, str, i, j, str.length, 0, isVisited)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	private boolean dfs(char[][] board, char[] str, int i, int j, int len, int idx, boolean[][] isVisited) {
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || str[idx] != board[i][j] || isVisited[i][j]) return false;
		if (idx == len - 1) return true;
		isVisited[i][j] = true;
		boolean ans = dfs(board, str, i - 1, j, len, idx + 1, isVisited) 
				|| dfs(board, str, i + 1, j, len, idx + 1, isVisited) 
				|| dfs(board, str, i, j - 1, len, idx + 1, isVisited) 
				|| dfs(board, str, i, j + 1, len, idx + 1, isVisited);
		isVisited[i][j] = false;
		return ans;
	}
}
