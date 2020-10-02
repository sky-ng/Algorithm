package com.sky.leetcode;

public class Problem1232 {
    public boolean checkStraightLine(int[][] coordinates) {
    	int x_target = coordinates[1][0] - coordinates[0][0];
    	int y_target = coordinates[1][1] - coordinates[0][1];
    	int n = coordinates.length;
    	for (int i = 2; i < n; ++i) {
    		if ((coordinates[i][0] - coordinates[i - 1][0]) * y_target != 
    				(coordinates[i][1] - coordinates[i - 1][1]) * x_target) {
    			return false;
    		}
    	}
    	return true;
    }
}
