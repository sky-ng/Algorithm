package com.sky.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Problem1024 {
    public int videoStitching(int[][] clips, int T) {
    	//首先对数组按开始时间排序
    	Arrays.sort(clips, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] != o2[0])
					return o1[0] - o2[0];
				else 
					return o1[1] - o2[1];
			}
		});
    	int end = 0, res = 0, i = 0;
    	while (end < T) {
    		int maxEnd = -1;
    		boolean flag = true;
			while (i < clips.length && clips[i][0] <= end) {
				maxEnd = Math.max(maxEnd, clips[i][1]);
				++i;
				flag = false;
			}
			if (flag) {
				//do something here
				return -1;
			} else {
				end = maxEnd;
				++res;
			}
    	}
    	return res;
    }
    
}
