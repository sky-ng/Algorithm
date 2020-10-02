package com.sky.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem994 {
	
	private int[][] x = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        
        //遍历求出所有腐烂橘子的坐标值，并存入队列中
        for (int i = 0; i < row; i++) {
        	for (int j = 0; j < col; j++) {
        		if (grid[i][j] == 2) {
        			queue.add(new int[] {i, j, 0});
        		}
        	}
        }
        
        int ans = 0;
        
        while (!queue.isEmpty()) {

    		int[] coordinate = queue.poll();
    		ans = coordinate[2];
        	grid[coordinate[0]][coordinate[1]] = 0;
        	for (int i = 0; i < 4; i++) {
        		if ((coordinate[0] + x[i][0]) >= 0 
        				&& (coordinate[0] + x[i][0]) < row 
        				&& (coordinate[1] + x[i][1]) >= 0 
        				&& (coordinate[1] + x[i][1]) < col 
        				&& grid[coordinate[0] + x[i][0]][coordinate[1] + x[i][1]] == 1) {
        			grid[coordinate[0] + x[i][0]][coordinate[1] + x[i][1]] = 2;
        			queue.add(new int[] {coordinate[0] + x[i][0], coordinate[1] + x[i][1], ans + 1});
        		}
        	}
        	
        }
        
        //若最终还有新鲜的橘子则返回-1
        for (int i = 0; i < row; i++) {
        	for (int j = 0; j < col; j++) {
        		if (grid[i][j] == 1) {
        			return -1;
        		}
        	}
        }
    	return ans;
    }
}
