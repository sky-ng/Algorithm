package com.sky.leetcode;

public class Problem1266 {
	
	private int ans = 0;
	
    public int minTimeToVisitAllPoints(int[][] points) {
    	for (int i = 1; i < points.length; ++i) {
    		pointAToPointB(points[i - 1], points[i]);
    	}
    	return ans;
    }
    
    private void pointAToPointB(int[] pointA, int[] pointB) {
    	switch (judgeDirection(pointA, pointB)) {
		case 1:
			ans += (pointB[0] - pointA[0]);
			break;
		case 2:
			ans += (pointB[1] - pointA[1]);
			break;
		case 3:
			ans += (pointA[0] - pointB[0]);
			break;
		case 4:
			ans += (pointA[1] - pointB[1]);
			break;
		case 5:
			ans += (Math.min(pointB[0] - pointA[0], pointB[1] - pointA[1]) 
					+ Math.abs(pointB[0] - pointA[0] - pointB[1] + pointA[1]));
			break;
		case 6:
			ans += (Math.min(pointA[0] - pointB[0], pointB[1] - pointA[1]) 
					+ Math.abs(pointA[0] - pointB[0] - pointB[1] + pointA[1]));
			break;
		case 7:
			ans += (Math.min(pointA[0] - pointB[0], pointA[1] - pointB[1]) 
					+ Math.abs(pointA[0] - pointB[0] - pointA[1] + pointB[1]));
			break;
		default:
			ans += (Math.min(pointB[0] - pointA[0], pointA[1] - pointB[1]) 
					+ Math.abs(pointB[0] - pointA[0] - pointA[1] + pointB[1]));
			break;
		}
    }
    
    private int judgeDirection(int[] pointA, int[] pointB) {
    	if (pointA[1] == pointB[1] && pointA[0] < pointB[0]) {
    		return 1;
    	} else if (pointA[0] == pointB[0] && pointA[1] < pointB[1]) {
    		return 2;
    	} else if (pointA[1] == pointB[1] && pointA[0] > pointB[0]) {
    		return 3;
    	} else if(pointA[0] == pointB[0] && pointA[1] > pointB[1]) {
    		return 4;
    	} else if (pointA[0] < pointB[0] && pointA[1] < pointB[1]) {
    		return 5;
    	} else if (pointA[0] > pointB[0] && pointA[1] < pointB[1]) {
    		return 6;
    	} else if (pointA[0] > pointB[0] && pointA[1] > pointB[1]) {
    		return 7;
    	} else {
    		return 8;
    	}
    }
}
