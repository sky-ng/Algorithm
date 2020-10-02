package com.sky.leetcode;

public class Problem874 {
	
    public int robotSim(int[] commands, int[][] obstacles) {
    	char cur_direction = 'N';
    	int[] cur_point = {0, 0};
    	int res = 0;
    	for (int c : commands) {
    		if (c == -1) {
    			cur_direction = turnRight(cur_direction);
    		} else if (c == -2) {
    			cur_direction = turnLeft(cur_direction);
    		} else {
    			cur_point = goToPoint(cur_point, cur_direction, c, obstacles);
    			int temp = cur_point[0] * cur_point[0] + cur_point[1] * cur_point[1];
    			if (res < temp) {
    				res = temp;
    			}
    		}
    	}
    	return res;
    }
    
    private char turnLeft(char cur) {
    	switch (cur) {
		case 'N':
			return 'W';
		case 'S':
			return 'E';
		case 'E':
			return 'N';
		default:
			return 'S';
		}
    }
    
    private char turnRight(char cur) {
    	switch (cur) {
		case 'N':
			return 'E';
		case 'S':
			return 'W';
		case 'E':
			return 'S';
		default:
			return 'N';
		}
    }
    
    private int[] goToPoint(int[] cur_point, char cur_direction, int step, int[][] obstacles) {
    	int[] toPoint = {0, 0};
    	switch (cur_direction) {
		case 'N':
			toPoint[0] = cur_point[0];
			toPoint[1] = cur_point[1] + step;
			break;
		case 'S':
			toPoint[0] = cur_point[0];
			toPoint[1] = cur_point[1] - step;
			break;
		case 'E':
			toPoint[0] = cur_point[0] + step;
			toPoint[1] = cur_point[1];
			break;
		default:
			toPoint[0] = cur_point[0] - step;
			toPoint[1] = cur_point[1];
			break;
		}
    	return addObstacles(cur_point, toPoint, cur_direction,  obstacles);
    }
    
    private int[] addObstacles(int[] cur_point, int[] toPoint, char cur_direction, int[][] obstacles) {
    	for (int[] o : obstacles) {
    		if (cur_point[0] == toPoint[0] && cur_point[0] == o[0]) {
    			if (cur_direction == 'N' && cur_point[1] < o[1] && toPoint[1] >= o[1]) {
    				toPoint[1] = o[1] - 1;
    			} else if (cur_direction == 'S' && cur_point[1] > o[1] && toPoint[1] <= o[1]) {
    				toPoint[1] = o[1] + 1;
    			}
    		} else if (cur_point[1] == toPoint[1] && cur_point[1] == o[1]) {
    			if (cur_direction == 'E' && cur_point[0] < o[0] && toPoint[0] >= o[0]) {
    				toPoint[0] = o[0] - 1;
    			} else if (cur_direction == 'W' && cur_point[0] > o[0] && toPoint[0] <= o[0]) {
    				toPoint[0] = o[0] + 1;
    			}
    		}
    	}
    	return toPoint;
    }
}
