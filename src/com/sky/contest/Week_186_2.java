package com.sky.contest;

public class Week_186_2 {
    public int maxScore(int[] cardPoints, int k) {
    	int len = cardPoints.length - k;
    	int min = Integer.MAX_VALUE;
    	int sum = 0;
    	int temp = 0;
    	for (int i = 0; i < len; i++) {
    		sum += cardPoints[i];
    	}
    	min = sum;
    	temp = sum;
    	for (int i = len; i < cardPoints.length; i++) {
    		sum += cardPoints[i];
    		temp  = temp - cardPoints[i - len] + cardPoints[i];
    		if (temp < min) {
    			min = temp;
    		}
    	}
        return sum - min;
    }
}
