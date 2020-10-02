package com.sky.leetcode;

import java.util.Arrays;

public class Problem167 {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0, index2 = numbers.length - 1;
        while (index1 < index2) {
        	if (numbers[index1] + numbers[index2] > target) {
        		index2--;
        	} else if (numbers[index1] + numbers[index2] < target) {
        		index1++;
        	} else {
        		return new int[] {index1 + 1, index2 + 1};
        	}
        }
        return null;
    }
    
    public static void main(String[] args) {
    	int numbers[] = {2, 7, 11, 15};
    	int target = 9;
		System.out.println(Arrays.toString(new Problem167().twoSum(numbers, target)));
	}
}
