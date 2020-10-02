package com.sky.leetcode;

public class Problem860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for (int i = 0; i < bills.length; i++) {
        	if (bills[i] == 5) {
        		five++;
        	} else if (bills[i] == 10) {
        		if (five <= 0) {
        			return false;
        		} else {
        			ten++;
        			five--;
        		}
        	} else {
        		if (five <= 0) {
        			return false;
        		}
        		
        		if (ten >= 1) {
        			five--;
        			ten--;
        			twenty++;
        			continue;
        		}
        		
        		if (five >= 3) {
        			five -= 3;
        			twenty++;
        			continue;
        		}
        		
        		return false;
        	}
        }
        return true;
    }
}
