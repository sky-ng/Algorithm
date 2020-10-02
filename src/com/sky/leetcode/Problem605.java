package com.sky.leetcode;

import java.util.Arrays;

public class Problem605 {
	
	// 判断位置i能否种植花朵
	private boolean helper(int[] flowerbed, int i) {
		if (flowerbed.length == 1) return true;
		if (i == 0) {
			return flowerbed[i + 1] == 0 ? true : false;
		} else if (i == flowerbed.length - 1) {
			return flowerbed[i - 1] == 0 ? true : false;
		} else {
			return (flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) ? true : false;
		}
	}
	
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
        	if (flowerbed[i] == 0 && helper(flowerbed, i)) {
        		flowerbed[i] = 1;
        		n--;
        	}
        }
        return n <= 0 ? true : false;
    }
}
