package com.sky.interview;

public class Problem16_01 {
    public int[] swapNumbers(int[] numbers) {
    	numbers[0] = numbers[0] + numbers[1];
    	numbers[1] = numbers[0] - numbers[1];
    	numbers[0] = numbers[0] - numbers[1];
    	return numbers;
    }
}
