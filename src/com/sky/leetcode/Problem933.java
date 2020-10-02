package com.sky.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem933 {
	public static void main(String[] args) {
		RecentCounter r = new RecentCounter();
		System.out.println(r.ping(1));
		System.out.println(r.ping(100));
		System.out.println(r.ping(3001));
		System.out.println(r.ping(3002));
	}
	
}

class RecentCounter {
	
	private Deque<Integer> queue;

    public RecentCounter() {
    	queue = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        while (!queue.isEmpty()) {
        	int tt = queue.pollFirst();
        	if (t - tt <= 3000) {
        		queue.addFirst(tt);
        		break;
        	}
        }
        queue.add(t);
        return queue.size();
    }
}