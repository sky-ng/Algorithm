package com.sky.leetcode;

public class Problem717 {
    public boolean isOneBitCharacter(int[] bits) {
    	int len = bits.length;
    	int temp = 0;
    	boolean flag = false;
    	while (temp < len) {
    		if (bits[temp] == 1) {
    			temp += 2;
    			flag = false;
    		} else {
    			temp += 1;
    			flag = true;
    		}
    	}
    	return flag ? true : false;
    }
    
    public static void main(String[] args) {
    	Problem717 p = new Problem717();
    	int[] bits = {1, 0, 0};
    	System.out.println(p.isOneBitCharacter(bits));
	}
}
