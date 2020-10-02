package com.sky.leetcode;

public class Problem744 {
	
	
    public char nextGreatestLetter(char[] letters, char target) {
    	int left = 0, right = letters.length - 1;
    	if (target >= letters[right]) {
    		return letters[0];
    	}
    	while (left <= right) {
    		int mid = left + ((right - left) >> 1);
    		if (letters[mid] <= target) {
    			left = mid + 1;
    		} else {
    			right = mid - 1;
    		}
    	}
    	return letters[left];
    }
    
    public static void main(String[] args) {
    	Problem744 p = new Problem744();
    	char[] letters = {'c', 'f', 'j'};
    	System.out.println(p.nextGreatestLetter(letters, 'a'));
    	System.out.println(p.nextGreatestLetter(letters, 'c'));
    	System.out.println(p.nextGreatestLetter(letters, 'd'));
    	System.out.println(p.nextGreatestLetter(letters, 'g'));
    	System.out.println(p.nextGreatestLetter(letters, 'j'));
    	System.out.println(p.nextGreatestLetter(letters, 'k'));
	}
}
