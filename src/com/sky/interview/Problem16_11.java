package com.sky.interview;

public class Problem16_11 {
	
	private int idx = 0;
	
    public int[] divingBoard(int shorter, int longer, int k) {
    	if (k == 0) return new int[0];
    	if (shorter == longer) {
    		return new int[] {k * shorter};
    	}
    	int[] ans = new int[k + 1];
    	for (int i = k; i >= 0; --i) {
    		ans[idx++] = shorter * i + longer * (k - i);
    	}
    	return ans;
    }
    
}
