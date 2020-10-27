package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
    	int maxRow = Math.max(r0, R - 1 - r0);
    	int maxCol = Math.max(c0, C - 1 - c0);
    	List<List<int[]>> list = new ArrayList<>(maxRow + maxCol + 1);
    	for (int i = 0; i < maxRow + maxCol + 1; ++i) {
    		List<int[]> temp = new ArrayList<>();
    		list.add(temp);
    	}
    	for (int i = 0; i < R; ++i) {
    		for (int j = 0; j < C; ++j) {
    			int dist = Math.abs(i - r0) + Math.abs(j - c0);
    			list.get(dist).add(new int[]{i, j});
    		}
    	}
    	int[][] res = new int[R * C][2];
    	int idx = 0;
    	for (int i = 0; i < maxRow + maxCol + 1; ++i) {
    		for (int j = 0; j < list.get(i).size(); ++j) {
    			res[idx++] = list.get(i).get(j);
    		}
    	}
    	return res;
    }
}
