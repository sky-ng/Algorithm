package com.sky.leetcode;

public class Problem1319 {
    public int makeConnected(int n, int[][] connections) {
    	//首先判断线缆数量不足
    	if (n > connections.length + 1) {
    		return -1;
    	}
    	int[] parent = new int[n];
    	int[] rank = new int[n];
    	init(parent, rank, n);
    	for (int[] connection : connections) {
    		union(parent, rank, connection[0], connection[1]);
    	}
    	return traverse(parent, n);
    }
    
    private void init(int[] parent, int[] rank, int n) {
    	for (int i = 0; i < n; ++i) {
    		parent[i] = -1;
    		rank[i] = 0;
    	}
    }
    
    private int findRoot(int[] parent, int x) {
    	int x_root = x;
    	while (parent[x_root] != -1) {
    		x_root = parent[x_root];
    	}
    	return x_root;
    }
    
    private boolean union(int[] parent, int[] rank, int x, int y) {
    	int x_root = findRoot(parent, x);
    	int y_root = findRoot(parent, y);
    	if (x_root == y_root) {
    		return false;
    	} else {
    		if (rank[x_root] > rank[y_root]) {
    			parent[y_root] = x_root;
    		} else if (rank[x_root] < rank[x_root]) {
    			parent[x_root] = y_root;
    		} else {
    			parent[x_root] = y_root;
    			rank[y_root]++;
    		}
    		return true;
    	}
    }
    
    private int traverse(int[] parent, int n) {
    	int ans = -1;
    	for (int i = 0; i < n; ++i) {
    		if (parent[i] == -1)
    			++ans;
    	}
    	return ans;
    }
}
