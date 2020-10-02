package com.sky.offer;

import java.util.Map;
import java.util.TreeMap;

public class Problem57_2 {
    public int[][] findContinuousSequence(int target) {
    	if (target == 1) return new int[0][];
    	int slow = 1;
    	int fast = 1;
    	int sum = 1;
    	Map<Integer, Integer> map = new TreeMap<>();
    	while (slow <= target / 2) {
    		if (sum < target) {
    			sum += (++fast);
    		} else if (sum > target) {
    			sum -= (slow++);
    		} else {
    			map.put(slow, fast);
    			fast++;
    			sum = sum + fast - slow;
    			slow++;
    		}
    	}
    	int[][] res = new int[map.size()][];
    	int cnt = 0;
    	for (int key : map.keySet()) {
    		int value = map.get(key);
    		int[] temp = new int[value - key + 1];
    		for (int i = key; i <= value; i++) {
    			temp[i - key] = i;
    		}
    		res[cnt++] = temp;
    	}
    	return res;
    }
    
    public static void main(String[] args) {
		new Problem57_2().findContinuousSequence(9);
	}
}
