package com.sky.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem1391 {
	
	private final int UP = 0;
	private final int DOWN = 1;
	private final int LEFT = 2;
	private final int RIGHT = 3;
	private final int ERROR = -1;
	
	private Set<Integer> set = new HashSet<>();
	
    public boolean hasValidPath(int[][] grid) {
    	int initDirection = ERROR;
    	switch(grid[0][0]) {
    	case 1:
    	case 3:
    		initDirection = LEFT;
    		break;
    	case 2:
    	case 6:
    		initDirection = UP;
    		break;
    	default:
    		initDirection = ERROR;
    	}
    	int[] nextBlock = new int[2];
    	if (initDirection == ERROR) 
    		return dfs(grid, grid.length, grid[0].length, 0, 0, getDirection(grid, 0, 0)[0], nextBlock) 
    				|| dfs(grid, grid.length, grid[0].length, 0, 0, getDirection(grid, 0, 0)[1], nextBlock);
    	else return dfs(grid, grid.length, grid[0].length, 0, 0, initDirection, nextBlock);
    }
    
    private boolean dfs(int[][] grid, int row, int col, int i, int j, int entrance, int[] nextBlock) {
//    	System.out.println(i + " " + j);

    		
    	
    	//越界
    	if (i < 0 || i >= row || j < 0 || j >= col) return false;
    	//entrance对不上
    	int[] direction = getDirection(grid, i, j);
    	if (entrance != direction[0] && entrance != direction[1]) {
    		return false;
    	}
    	
    	if (set.contains(i * col + j)) return false;
    	if (i != 0 || j != 0) {
//    		System.out.println(i * col + j);
    		set.add(i * col + j);
    	}
    	
    	//递归出口
    	if (i == row - 1 && j == col - 1) return true;
    	if (getNextBlock(grid, row, col, i, j, entrance, nextBlock)) {
    		return dfs(grid, row, col, nextBlock[0], nextBlock[1], 
    				contrastDirection(getExitDirection(grid[i][j], entrance)), nextBlock);
    	} else {
    		return false;
    	}
    }
    
    private int contrastDirection(int direction) {
    	switch (direction) {
    	case LEFT:
    		return RIGHT;
    	case RIGHT:
    		return LEFT;
    	case UP:
    		return DOWN;
    	default:
    		return UP;
    	}
    }
    
    private int[] getDirection(int[][] grid, int i, int j) {
    	switch(grid[i][j]) {
    	case 1:
    		return new int[] {LEFT, RIGHT};
    	case 2:
    		return new int[] {UP, DOWN};
    	case 3:
    		return new int[] {LEFT, DOWN};
    	case 4:
    		return new int[] {RIGHT, DOWN};
    	case 5:
    		return new int[] {UP, LEFT};
    	default:
    		return new int[] {UP, RIGHT};
    	}
    }
    
    private int getExitDirection(int street, int entranceDirection) {
    	switch (street) {
    	case 1:
    		return entranceDirection == LEFT ? RIGHT : LEFT;
    	case 2:
    		return entranceDirection == UP ? DOWN : UP;
    	case 3:
    		return entranceDirection == LEFT ? DOWN : LEFT;
    	case 4:
    		return entranceDirection == RIGHT ? DOWN : RIGHT;
    	case 5:
    		return entranceDirection == UP ? LEFT : UP;
		default:	//case 6
			return entranceDirection == UP ? RIGHT : UP;
    	}
    }
    
    private boolean getNextBlock(int[][] grid, int row, int col, int i, int j, int entrance, int[] nextBlock) {
    	int exitDirection = getExitDirection(grid[i][j], entrance);
    	switch (exitDirection) {
    	case LEFT:
    		nextBlock[0] = i;
    		nextBlock[1] = j - 1;
    		break;
    	case RIGHT:
    		nextBlock[0] = i;
    		nextBlock[1] = j + 1;
    		break;
    	case UP:
    		nextBlock[0] = i - 1;
    		nextBlock[1] = j;
    		break;
    	default:	//case DOWN
    		nextBlock[0] = i + 1;
    		nextBlock[1] = j;
    	}
    	if (nextBlock[0] < 0 || nextBlock[1] < 0 || nextBlock[0] >= row || nextBlock[1] >= col) {
    		return false;
    	}
    	return true;
    }
    
    public static void main(String[] args) {
		Problem1391 p = new Problem1391();
		int[][] grid = {{4, 1, 3}, {6, 1, 2}};
		System.out.println(p.hasValidPath(grid));
	}
    
}
