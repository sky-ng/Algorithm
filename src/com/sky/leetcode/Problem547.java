package com.sky.leetcode;

public class Problem547 {
    public int findCircleNum(int[][] M) {
    	int n = M.length;
    	int[] parent = new int[n];
    	for (int i = 0; i < n; ++i) {
    		parent[i] = -1;
    	}
    	for (int i = 0; i < n - 1; ++i) {
    		for (int j = i + 1; j < n; ++j) {
    			if (M[i][j] == 1) {
    				union(parent, i, j);
    			}
    		}
    	}
    	int ans = 0;
    	for (int i = 0; i < n; ++i) {
    		if (parent[i] == -1) ++ans;
    	}
    	return ans;
    }
    
    private void union(int[] parent, int x, int y) {
    	int x_root = find(parent, x);
    	int y_root = find(parent, y);
    	if (x_root != y_root) {
    		parent[x_root] = y_root;
    	}
    }
    
    private int find(int[] parent, int x) {
    	int x_root = x;
    	while (parent[x_root] != -1) {
    		x_root = parent[x_root];
    	}
    	return x_root;
    }
}
