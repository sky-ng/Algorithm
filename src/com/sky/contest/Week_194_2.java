package com.sky.contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Week_194_2 {
	
    public String[] getFolderNames(String[] names) {
    	int n = names.length;
    	HashMap<String, Integer> map = new HashMap<>();
    	String[] ans = new String[n];
    	for (int i = 0; i < n; ++i) {
    		int k = map.getOrDefault(names[i], -1) + 1;
    		if (k == 0) {
    			ans[i] = names[i];
    			map.put(names[i], 0);
    		} else {
    			String name = names[i] + "(" + k + ")";
    			while (map.get(name) != null) {
    				++k;
    				name = names[i] + "(" + k + ")";
    			}
    			ans[i] = name;
    			map.put(names[i], k);
    			map.put(name, 0);
    		}
    	}
    	return ans;
    }
    
	public static void main(String[] args) {
		Week_194_2 p = new Week_194_2();
		String[] names = {"wano","wano","wano","wano"};
		System.out.println(Arrays.toString(p.getFolderNames(names)));
	}
}
