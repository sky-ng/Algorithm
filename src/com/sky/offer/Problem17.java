package com.sky.offer;

public class Problem17 {
    public int[] printNumbers(int n) {
        int maxNum = (int) Math.pow(10, n);
        int[] res = new int[maxNum - 1];
        for (int i = 1; i < maxNum; i++) {
			res[i - 1] = i;
		}
        return res;
    }
    
    public static void main(String[] args) {
    	Problem17 p = new Problem17();
    	int[] res = p.printNumbers(2);
    	for (int i = 0; i < res.length; i++) {
    		System.out.println(res[i]);
    	}
	}
}
