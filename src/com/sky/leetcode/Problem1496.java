package com.sky.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem1496 {
    public boolean isPathCrossing(String path) {
    	int x = 0, y = 0;
    	Set<String> set = new HashSet<>();
    	set.add(x + "," + y);
    	for (char c : path.toCharArray()) {
    		String s;
    		switch (c) {
    		case 'N':
    			++y;
    			s = x + "," + y;
    			if (set.contains(s)) return true;
    			set.add(s);
    			break;
    		case 'S':
    			--y;
    			s = x + "," + y;
    			if (set.contains(s)) return true;
    			set.add(s);
    			break;
    		case 'E':
    			++x;
    			s = x + "," + y;
    			if (set.contains(s)) return true;
    			set.add(s);
    			break;
    		case 'W':
    			--x;
    			s = x + "," + y;
    			if (set.contains(s)) return true;
    			set.add(s);
    			break;
    		}
    	}
    	return false;
    }
}
