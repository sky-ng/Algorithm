package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
    	for (String cpdomain : cpdomains) {
    		
    		//900   yahoo.com
        	String[] temp = cpdomain.split(" ");
        	//yahoo  com
        	String[] domains = temp[1].split("\\.");
        	for (int i = 0; i < domains.length; i++) {
        		StringBuilder sb = new StringBuilder();
        		sb.append(domains[i]);
        		for (int j = i + 1; j < domains.length; j++) {
        			sb.append("." + domains[j]);
        		}
        		map.put(sb.toString(), map.containsKey(sb.toString()) ? map.get(sb.toString()) + Integer.valueOf(temp[0]) : Integer.valueOf(temp[0]));
        	}
        }
    	for (Map.Entry<String, Integer> entry : map.entrySet()) {
    		ans.add(entry.getValue() + " " + entry.getKey());
    	}
    	return ans;
    }
    
    
    public static void main(String[] args) {
    	Problem811 p = new Problem811();
		String[] cpdomains = {"9001 discuss.leetcode.com"};
		System.out.println(p.subdomainVisits(cpdomains));
	}
}
