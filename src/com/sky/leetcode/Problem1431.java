package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	int max = 0;
    	for (int c : candies) {
    		max = c > max ? c : max;
    	}
    	List<Boolean> res = new ArrayList<>();
    	for (int c : candies) {
    		res.add(c + extraCandies >= max);
    	}
    	return res;
    }
}
