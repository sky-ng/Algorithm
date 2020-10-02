package com.sky.poj;

import java.util.Scanner;

public class Problem2586 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int s = in.nextInt();
			int d = in.nextInt();
			if (4 * s < d) {
				int ans = 10 * s- 2 * d;
				System.out.println(ans >= 0 ? ans : "Deficit");
			} else if (3 * s < 2 * d) {
				int ans = 8 * s- 4 * d;
				System.out.println(ans >= 0 ? ans : "Deficit");
			} else if (2 * s < 3 * d) {
				int ans = 6 * s - 6 * d;
				System.out.println(ans >= 0 ? ans : "Deficit");
			} else if (s < 4 * d) {
				int ans = 3 * s - 9 * d;
				System.out.println(ans >= 0 ? ans : "Deficit");
			} else {
				System.out.println("Deficit");
			}
		}
	}
}
