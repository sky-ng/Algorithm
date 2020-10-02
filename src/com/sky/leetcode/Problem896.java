package com.sky.leetcode;

public class Problem896 {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        if (len == 1) {
        	return true;
        }
        int temp = A[0];
        int flag = 0;
        for (int i = 1; i < A.length; i++) {
        	if (temp < A[i]) {
        		if (flag == -1) {
        			return false;
        		}
        		flag = 1;
        	} else if (temp > A[i]) {
        		if (flag == 1) {
        			return false;
        		}
        		flag = -1;
        	} else {
        		if (flag == 0) {
        			flag = 0;
        		}
        	}
        	temp = A[i];
        }
        return true;
    }
}
