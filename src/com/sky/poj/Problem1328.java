package com.sky.poj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem1328 {
	
	private static int findMinRadar(double[][] interval, int n) {
		Arrays.sort(interval, new Comparator<double[]>() {
			@Override
			public int compare(double[] o1, double[] o2) {
				if (o1[1] > o2[1]) {
					return 1;
				} else if (o1[1] < o2[1]) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		int ans = 1;
		double end = interval[0][1];
		for (int i = 1; i < n; ++i) {
			if (interval[i][0] > end) {
				++ans;
				end = interval[i][1];
			}
		}
		return ans;
	}
	
	private static boolean getInterval(int[][] coor, int n, int d, double[][] interval) {
		for (int i = 0; i < n; ++i) {
			if (d < coor[i][1]) {
				return false;
			} else {
				double delta = (double) (d * d - coor[i][1] * coor[i][1]);
				interval[i][0] = coor[i][0] - Math.sqrt(delta);
				interval[i][1] = coor[i][0] + Math.sqrt(delta);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = 0;
		while (true) {
			++cnt;
			int n = in.nextInt();
			int d = in.nextInt();
			//结束标识
			if (n == 0 && d == 0) break;
			int[][] coor = new int[n][2];
			double[][] interval = new double[n][2];
			for (int i = 0; i < n; ++i) {
				coor[i][0] = in.nextInt();
				coor[i][1] = in.nextInt();
			}
			if (getInterval(coor, n, d, interval)) {
				int ans = findMinRadar(interval, n);
				System.out.printf("Case %d: %d\n", cnt, ans);
			} else {
				System.out.printf("Case %d: -1\n", cnt);
			}
		}
	}


}
