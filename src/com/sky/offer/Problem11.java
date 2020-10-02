package com.sky.offer;

public class Problem11 {
    public int minArray(int[] numbers) {
    	int len = numbers.length;
    	for (int i = 1; i < len; i++) {
    		if (numbers[i] < numbers[i - 1]) {
    			return numbers[i];
    		}
    	}
    	return numbers[0];
    }
}
