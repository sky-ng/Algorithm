package com.sky.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem16_19 {
	
	private int cnt = 0;

	public int[] pondSizes(int[][] land) {
		int m = land.length;
		int n = land[0].length;
		List<Integer> list = new ArrayList<>();
		boolean[][] isVisited = new boolean[m][n];
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				if (land[i][j] == 0 && !isVisited[i][j]) {
					cnt = 0;
					dfs(land, isVisited, m, n, i, j);
					list.add(cnt);
				}
			}
		}
		int[] ans = new int[list.size()];
		for (int i = 0; i < list.size(); ++i) {
			ans[i] = list.get(i);
		}
		Arrays.sort(ans);
		return ans;
	}
	
	private boolean checkIndex(int m, int n, int i, int j) {
		if (i < 0 || i >= m) return false;
		if (j < 0 || j >= n) return false;
		return true;
	}
	
	private boolean access(int[][] land, boolean[][] isVisited, int m, int n, int i, int j) {
		return checkIndex(m, n, i, j) && !isVisited[i][j] && land[i][j] == 0;
	}
	
	private void dfs(int[][] land, boolean[][] isVisited, int m, int n, int i, int j) {
		cnt++;
		isVisited[i][j] = true;
		if (access(land, isVisited, m, n, i, j - 1)) {
			dfs(land, isVisited, m, n, i, j - 1);
		}
		if (access(land, isVisited, m, n, i - 1, j - 1)) {
			dfs(land, isVisited, m, n, i - 1, j - 1);
		}
		if (access(land, isVisited, m, n, i - 1, j)) {
			dfs(land, isVisited, m, n, i - 1, j);
		}
		if (access(land, isVisited, m, n, i - 1, j + 1)) {
			dfs(land, isVisited, m, n, i - 1, j + 1);
		}
		if (access(land, isVisited, m, n, i, j + 1)) {
			dfs(land, isVisited, m, n, i, j + 1);
		}
		if (access(land, isVisited, m, n, i + 1, j)) {
			dfs(land, isVisited, m, n, i + 1, j);
		}
		if (access(land, isVisited, m, n, i + 1, j - 1)) {
			dfs(land, isVisited, m, n, i + 1, j - 1);
		}
		if (access(land, isVisited, m, n, i + 1, j + 1)) {
			dfs(land, isVisited, m, n, i + 1, j + 1);
		}
	}

	public static void main(String[] args) {
		int[][] land = {{0,2,1,0},{0,1,0,1},{1,1,0,1},{0,1,0,1}};
//		int[][] land = { { 1, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 } };
		Problem16_19 p = new Problem16_19();
		int[] res = p.pondSizes(land);
		System.out.println(Arrays.toString(res));
	}
}
