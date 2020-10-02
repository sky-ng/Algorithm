package com.sky.examination;

public class test {
	public static void main(String[] args) {
		String a = "hello2";
		String b = "hello" + 2;
		System.out.println((a == b));
	}

	private static void operator(StringBuffer a, StringBuffer b) {
		a.append(b);
		b = a;
	}
}
