package com.sky.contest;

public class Week_189_1 {
	
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
    	int ans = 0;
    	for (int i = 0; i < startTime.length; ++i) {
    		if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
    			++ans;
    		}
    	}
    	return ans;
    }
}
