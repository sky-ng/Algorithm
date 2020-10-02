package com.sky.examination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Netease_Solution1 {
	
	//能组成七星不靠返回true，否则返回false
	private static boolean judge(String[] arr) {
		List<String> T_arr = new ArrayList<>();
		List<String> B_arr = new ArrayList<>();
		List<String> W_arr = new ArrayList<>();
		for (String s : arr) {
			if (s.contains("T")) {
				T_arr.add(s);
			} else if (s.contains("B")) {
				B_arr.add(s);
			} else {
				W_arr.add(s);
			}
		}
		if (T_arr.size() > 3 || B_arr.size() > 3 || W_arr.size() > 3)
			return false;
		Collections.sort(T_arr);
		Collections.sort(B_arr);
		Collections.sort(W_arr);
		if (T_arr.size() != 1) {
			for (int i = 0; i < T_arr.size() - 1; ++i) {
//				if ()
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; ++i) {
			String[] arr = new String[7];
			for (int j = 0; j < 7; ++j) {
				arr[j] = in.next();
			}
			System.out.println(judge(arr) ? "YES" : "NO");
		}
		
//		String[] arr = new String[2];
//		System.out.println(Arrays.toString(arr));
	}
	
	
}
