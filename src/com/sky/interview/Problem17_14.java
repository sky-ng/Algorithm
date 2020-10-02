package com.sky.interview;

import java.util.Arrays;

public class Problem17_14 {
    public int[] smallestK(int[] arr, int k) {
    	quickSort(arr, 0, arr.length - 1, k);
    	return Arrays.copyOfRange(arr, 0, k);
    }
    
    public void quickSort(int[] arr, int s, int e, int k) {
    	if (s >= e) return;
    	int p = arr[s];
    	int i = s, j = e;
    	while (i != j) {
    		while (i < j && arr[j] >= p)
    			--j;
    		swap(arr, i, j);
    		while (i < j && arr[i] <= p)
    			++i;
    		swap(arr, i, j);
    	}
    	if (i == (k - 1)) {
    		return;
    	} else if (i < (k - 1)) {
    		quickSort(arr, i + 1, e, k);
    	} else {
    		quickSort(arr, s, i - 1, k);
    	}
    }
    
    private void swap(int[] arr, int i, int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    
    public static void main(String[] args) {
    	Problem17_14 p = new Problem17_14();
    	int[] arr = {1,3,1,6,3,9,4,6,8};
    	int k = 4;
    	int[] res = p.smallestK(arr, k);
    	System.out.println(Arrays.toString(res));
	}
}
