package com.sky.offer;

import java.util.LinkedList;
import java.util.List;

public class Problem50 {
    public char firstUniqChar(String s) {
        List<Character> listA = new LinkedList<>();
        List<Character> listB = new LinkedList<>();
        for (Character c : s.toCharArray()) {
        	if (listB.contains(c)) {
        		
        	} else if (listA.contains(c)) {
        		listA.remove(c);
        		listB.add(c);
        	} else {
        		listA.add(c);
        	}
        }
    	return listA.isEmpty() ? ' ' : listA.get(0);
    }
}
