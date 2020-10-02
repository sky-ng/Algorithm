package com.sky.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Problem406 {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0) {
        	return new int[0][0];
        }
        Arrays.sort(people, new Comparator<int[]>() {
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		return o1[0] == o2[0] ? (o1[1] - o2[1]) : (o2[0] - o1[0]);
        	}
		});
        List<int[]> list = new LinkedList<>();
        for (int i = 0; i < people.length; i++) {
        	list.add(people[i][1], people[i]);
        }
    	return list.toArray(new int[people.length][]);
    }
    
}
