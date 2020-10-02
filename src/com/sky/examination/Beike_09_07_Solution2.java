package com.sky.examination;

import java.util.Scanner;

public class Beike_09_07_Solution2 {
	
	//判断是否ch_arr的前后两段经过复制得到的
	private static boolean judge(int n, char[] ch_arr) {
		for (int i = 0; i < n / 2; ++i) {
			if (ch_arr[i] != ch_arr[i + n / 2]) return false;
		}
		return true;
	}
	
	private static int getMinSteps(int n, String s) {
		int ans = 0;
		char[] str = s.toCharArray();
		if (n % 2 == 1) {
			++ans;
			--n;
		}
		for (int i = n; i > 0; i -= 2) {
			if (judge(i, str)) {
				ans += (i / 2 + 1);
				break;
			} else {
				ans += 2;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//读一行空行，否则下一行无法输入字符串
		in.nextLine();
		String s = in.nextLine();
		System.out.println(getMinSteps(n, s));
//		System.out.println(getMinSteps(6, "abcdef"));
//		System.out.println(getMinSteps(9, "ababababc"));
//		System.out.println(getMinSteps(8, "abababab"));
//		System.out.println(getMinSteps(7, "abababa"));
	}
}
