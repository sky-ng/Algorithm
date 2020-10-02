package com.sky.poj;

import java.util.Scanner;

public class Problem2109 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n, p;
		while (in.hasNext()) {
			n = in.nextDouble();
			p = in.nextDouble();
			System.out.println(Math.round(Math.pow(p, 1 / n)));
		}
	}
}
