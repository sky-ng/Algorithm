package com.sky.leetcode;

public class Problem990 {
    public boolean equationsPossible(String[] equations) {
    	int[] parent = new int[26];
    	for (int i = 0; i < 26; i++) {
    		parent[i] = -1;
    	}
    	for (String e : equations) {
    		if (e.charAt(1) == '=') {
    			union(parent, e.charAt(0) - 'a', e.charAt(3) - 'a');
    		}
    	}
    	for (String e : equations) {
    		if (e.charAt(1) == '!') {
    			if (findRoot(parent, e.charAt(0) - 'a') == findRoot(parent, e.charAt(3) - 'a')) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
    
    private boolean union(int[] parent, int x, int y) {
    	int x_root = findRoot(parent, x);
    	int y_root = findRoot(parent, y);
    	if (x_root == y_root) {
    		return false;
    	} else {
    		parent[y_root] = x_root;
    		return true;
    	}
    }
    
    private int findRoot(int[] parent, int x) {
    	int x_root = x;
    	while (parent[x_root] != -1) {
    		x_root = parent[x_root];
    	}
    	return x_root;
    }
    
    public static void main(String[] args) {
		String[] equations = {"b==b","b==e","e==c","d!=e"};
		boolean flag = new Problem990().equationsPossible(equations);
		System.out.println(flag);
	}
}
