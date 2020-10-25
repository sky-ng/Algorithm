package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem845 {
    public int longestMountain(int[] A) {
    	int n = A.length;
    	if (n < 3) return 0;
    	List<Integer> list = new ArrayList<>();
    	for (int i = 1; i < n - 1; ++i) {
    		if (A[i] > A[i - 1] && A[i] > A[i + 1])
    			list.add(i);
    	}
    	int ans = 0;
    	for (int i = 0; i < list.size(); ++i) {
    		int left = list.get(i);
    		int right = list.get(i);
    		while (left >= 1 && A[left] > A[left - 1]) {
    			--left;
    		}
    		while (right <= n - 2 && A[right] > A[right + 1]) {
    			++right;
    		}
    		ans = Math.max(ans, right - left + 1);
    	}
    	return ans;
    }
}
