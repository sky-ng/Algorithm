package com.sky.leetcode;

public class Problem566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if ((row * col) != (r * c)) {
        	return nums;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++) {
        	res[i / c][i % c] = nums[i / col][i % col];
        }
        return res;
    }
}
