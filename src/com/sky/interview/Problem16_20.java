package com.sky.interview;

import java.util.ArrayList;
import java.util.List;

public class Problem16_20 {
    public List<String> getValidT9Words(String num, String[] words) {
    	int n = num.length();
    	char[] num_arr = num.toCharArray();
    	int[] letters = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
    	List<String> list = new ArrayList<>();
    	for (String word : words) {
    		char[] ch_arr = word.toCharArray();
    		boolean flag = true;
    		for (int i = 0; i < n; ++i) {
    			if (letters[ch_arr[i] - 'a'] + '0' != num_arr[i]) {
    				flag = false;
    				break;
    			}
    		}
    		if (flag) {
    			list.add(word);
    		}
    	}
    	return list;
    }
}
