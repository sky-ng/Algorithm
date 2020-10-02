package com.sky.leetcode;

public class Problem1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
    	int real_start = Math.min(start, destination);
    	int real_destination = Math.max(start, destination);
    	int n = distance.length;
    	int sum = 0;
    	int cnt = 0;
    	for (int i = 0; i < n; ++i) {
    		sum += distance[i];
    		if (i >= real_start && i < real_destination) {
    			cnt += distance[i];
    		}
    	}
    	return Math.min(cnt, sum - cnt);
    }
}
