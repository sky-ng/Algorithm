package com.sky.leetcode;

public class Problem1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles = 0;
        int ans = 0;
        int currentBottles = numBottles + emptyBottles;
        while (currentBottles >= numExchange) {
        	ans += numBottles;
        	emptyBottles = currentBottles % numExchange;
        	numBottles = currentBottles / numExchange;
        	currentBottles = numBottles + emptyBottles;
        }
        ans += numBottles;
        return ans;
    }
    
    public static void main(String[] args) {
		System.out.println(-4%3);
	}
}
