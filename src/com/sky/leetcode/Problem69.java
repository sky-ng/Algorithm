package com.sky.leetcode;

public class Problem69 {
	
    public int mySqrt(int x) {
    	int left = 1, right = x;
    	int mid = left + ((right - left) >> 2);
    	while (left <= right) {
    		if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
    			return mid;
    		}
    		if (mid < x / mid) {
    			left = mid + 1;
    		} else {
    			right = mid - 1;
    		}
    		mid = left + ((right - left) >> 2);
    	}
    	return 0;
    }
    
    public static void main(String[] args) {
    	//0
		System.out.println(new Problem69().mySqrt(0));
		//1
		System.out.println(new Problem69().mySqrt(1));
		//1
		System.out.println(new Problem69().mySqrt(2));
		//1
		System.out.println(new Problem69().mySqrt(3));
		//2
		System.out.println(new Problem69().mySqrt(4));
		//2
		System.out.println(new Problem69().mySqrt(5));
		//2
		System.out.println(new Problem69().mySqrt(6));
		//2
		System.out.println(new Problem69().mySqrt(7));
		//2
		System.out.println(new Problem69().mySqrt(8));
		//3
		System.out.println(new Problem69().mySqrt(9));
		
		System.out.println(new Problem69().mySqrt(101));
		
		System.out.println(new Problem69().mySqrt(2147395599));
	}
}
