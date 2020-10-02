package com.sky.examination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Meituan_Solution3 {
	
	//存放已有的订单
	private static Set<Integer> set = new HashSet<>();
	
	//存放根节点下标
	private static ArrayList<Integer> list = new ArrayList<>();
	
	
	//查找根结点下标
	private static int findRoot(int[] parent, int x) {
		int x_root = x;
		while (parent[x_root] != -1) {
			x_root = parent[x_root];
		}
		return x_root;
	}
	
	//合并
	private static boolean unionVertices(int[] parent, int x, int y) {
		int x_root = findRoot(parent, x);
		int y_root = findRoot(parent, y);
		if (x_root == y_root) {
			return false;
		} else {
			parent[y_root] = x_root;
			return true;
		}
	}
	
	//统计根节点个数
	private static int rootCount(int[] parent, int n) {
		int ans = 0;
		for (int i = 1; i < n; ++i) {
			if (parent[i] == -1) {
				++ans;
				list.add(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] parent = new int[n + 1];
		//将数组parent所有元素填充-1
		Arrays.fill(parent, -1);
		for (int i = 0; i < m; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (!set.contains(a) || !set.contains(b)) {
				unionVertices(parent, a, b);
				set.add(a);
				set.add(b);
			}
		}
		// 小区的数量
		int communityCount = rootCount(parent, n + 1);
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>(communityCount);
		for (int i = 0; i < communityCount; ++i) {
			ArrayList<Integer> temp = new ArrayList<>();
			ans.add(temp);
		}
		for (int i = 1; i < n + 1; ++i) {
			ans.get(list.indexOf(findRoot(parent, i))).add(i);
		}
		for (int i = 0; i < communityCount; ++i) {
			Collections.sort(ans.get(i));
		}
		Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				return o1.get(0) - o2.get(0);
			}
		});
		System.out.println(communityCount);
		for (int i = 0; i < communityCount; ++i) {
			System.out.println(ans.get(i));
		}
	}
}
