package com.sky.leetcode;

public class Problem1559 {
	
	private boolean[][] visited;
	
	private final int UP = 1;
	private final int DOWN = 2;
	private final int LEFT = 3;
	private final int RIGHT = 4;
	
	public static void main(String[] args) {
		Problem1559 p = new Problem1559();
		char[][] grid = {{'a', 'b', 'b'},{'b', 'z', 'b'},{'b', 'b', 'a'}};
		p.containsCycle(grid);
	}
	
    public boolean containsCycle(char[][] grid) {
    	int row = grid.length;
    	int col = grid[0].length;
    	visited = new boolean[row][col];
    	for (int i = 0; i < row; ++i) {
    		if (!visited[i][0] && dfs(grid, row, col, i, 0, LEFT, true)) {
//    			System.out.println("(" + i + "," + 0 + ")");
    			return true;
    		}
    		for (int j = 1; j < col; ++j) {
    			if (!visited[i][j] && dfs(grid, row, col, i, j, LEFT, true)) {
//    				System.out.println("(" + i + "," + j + ")");
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    private boolean checkIndex(int row, int col, int i, int j) {
    	if (i < 0 || i >= row || j < 0 || j >= col) {
    		return false;
    	}
    	return true;
    }
    
    private boolean dfs(char[][] grid, int row, int col, int i, int j, int originalDirection, boolean initial) {
    	if (initial) System.out.println();
    	System.out.println("(" + i + "," + j + ")");
    	if (!checkIndex(row, col, i, j)) {
    		return false;
    	}
    	
    	if (!initial) {
    		if (originalDirection == LEFT && grid[i][j] != grid[i][j - 1]) {
    			return false;
    		} else if (originalDirection == RIGHT && grid[i][j] != grid[i][j + 1]) {
    			return false;
    		} else if (originalDirection == UP && grid[i][j] != grid[i - 1][j]) {
    			return false;
    		} else if (originalDirection == DOWN && grid[i][j] != grid[i + 1][j]) {
    			return false;
    		}
    	}
    	
    	visited[i][j] = true;
    	
    	if (originalDirection == LEFT) {
    		if (checkIndex(row, col, i, j + 1) && visited[i][j + 1]) return true;
    		if (checkIndex(row, col, i - 1, j) && visited[i - 1][j]) return true;
    		if (checkIndex(row, col, i + 1, j) && visited[i + 1][j]) return true;
    		return dfs(grid,row, col, i, j + 1, LEFT, false) || dfs(grid,row, col, i - 1, j, DOWN, false) 
    				|| dfs(grid,row, col, i + 1, j, UP, false);
    	} else if (originalDirection == RIGHT) {
    		if (checkIndex(row, col, i, j - 1) && visited[i][j - 1]) return true;
    		if (checkIndex(row, col, i - 1, j) && visited[i - 1][j]) return true;
    		if (checkIndex(row, col, i + 1, j) && visited[i + 1][j]) return true;
    		return dfs(grid,row, col, i, j - 1, RIGHT, false) || dfs(grid,row, col, i - 1, j, DOWN, false) 
    				|| dfs(grid,row, col, i + 1, j, UP, false);
    	} else if (originalDirection == DOWN) {
    		if (checkIndex(row, col, i, j + 1) && visited[i][j + 1]) return true;
    		if (checkIndex(row, col, i, j - 1) && visited[i][j - 1]) return true;
    		if (checkIndex(row, col, i - 1, j) && visited[i - 1][j]) return true;
    		return dfs(grid,row, col, i, j - 1, RIGHT, false) || dfs(grid,row, col, i, j + 1, LEFT, false)
    				|| dfs(grid,row, col, i + 1, j, UP, false);
    	} else {
    		if (checkIndex(row, col, i, j + 1) && visited[i][j + 1]) return true;
    		if (checkIndex(row, col, i, j - 1) && visited[i][j - 1]) return true;
    		if (checkIndex(row, col, i + 1, j) && visited[i + 1][j]) return true;
    		return dfs(grid,row, col, i, j - 1, RIGHT, false) || dfs(grid,row, col, i, j + 1, LEFT, false)
    				|| dfs(grid,row, col, i - 1, j, DOWN, false);
    	}
    }
}
