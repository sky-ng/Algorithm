package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem401 {
	
	private List<String> ans = new ArrayList<>();
	
    public List<String> readBinaryWatch(int num) {
    	int[] arr = new int[10];
    	backTrack(arr, 0, num);
    	return ans;
    }
    
    private void backTrack(int[] arr, int idx, int num) {
    	if (num == 0) {
    		int hour = arr[0] * 1 + arr[1] * 2 + arr[2] * 4 + arr[3] * 8;
    		int minute = arr[4] * 1 + arr[5] * 2 + arr[6] * 4 + arr[7] * 8
    				+ arr[8] * 16 + arr[9] * 32;
    		if (hour >= 12 || minute >= 60) return;
    		ans.add(hour + ":" + (minute >= 10 ? minute : ("0" + minute)));
    		return;
    	}
    	if (idx == 10 && num != 0) return;
    	flip(arr, idx);
    	//当前灯亮
    	backTrack(arr, idx + 1, num - 1);
    	flip(arr, idx);
    	//当前灯不亮
    	backTrack(arr, idx + 1, num);
    }
    
    private void flip(int[] arr, int idx) {
    	if (arr[idx] == 1) {
    		arr[idx] = 0;
    	} else {
    		arr[idx] = 1;
    	}
    }
}
