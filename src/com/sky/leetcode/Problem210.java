package com.sky.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    	if (numCourses == 0) return new int[0];
    	int[] in = new int[numCourses];
    	for (int[] pre : prerequisites) {
    		++in[pre[0]];
    	}
    	Queue<Integer> queue = new LinkedList<>();
    	for (int i = 0; i < numCourses; ++i) {
    		if (in[i] == 0) queue.offer(i);
    	}
    	int idx = 0;
    	int[] ans = new int[numCourses];
    	while (!queue.isEmpty()) {
    		int cur = queue.poll();
    		ans[idx++] = cur;
    		for (int[] pre : prerequisites) {
    			if (pre[1] == cur) {
    				--in[pre[0]];
    				if (in[pre[0]] == 0) queue.offer(pre[0]);
    			}
    		}
    	}
    	if (idx == numCourses) return ans;
    	else return new int[0];
    }
}
