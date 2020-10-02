package com.sky.contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week_189_3 {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
    	List<List<String>> temp = new ArrayList<>(favoriteCompanies);
    	List<List<String>> temp1 = new ArrayList<>();
    	List<Integer> res = new ArrayList<>();
    	Collections.sort(favoriteCompanies, new Comparator<List<String>>() {
			@Override
			public int compare(List<String> o1, List<String> o2) {
				return o2.size() - o1.size();
			}
		});
    	temp1.add(favoriteCompanies.get(0));
    	for (int i = 1; i < favoriteCompanies.size(); ++i) {
    		boolean flag = true;
    		for (List<String> t : temp1) {
    			if (t.containsAll(favoriteCompanies.get(i))) {
    				flag = false;
    				break;
    			}
    		}
    		if (flag) temp1.add(favoriteCompanies.get(i));
    	}
    	for (int i = 0; i < temp.size(); ++i) {
    		if (temp1.contains(temp.get(i))) {
    			res.add(i);
    		}
    	}
    	return res;
    }
    
    public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("1");
		l1.add("2");
		List<String> l2 = new ArrayList<>();
		l2.add("1");
		l2.add("2");
		l2.add("3");
		List<String> l3 = new ArrayList<>();
		l3.add("1");
		List<List<String>> favoriteCompanies = new ArrayList<>();
		favoriteCompanies.add(l1);
		favoriteCompanies.add(l2);
		favoriteCompanies.add(l3);
		new Week_189_3().peopleIndexes(favoriteCompanies);
	}

}
