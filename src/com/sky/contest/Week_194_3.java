package com.sky.contest;

import java.util.HashMap;
import java.util.Map;

public class Week_194_3 {
    public int[] avoidFlood(int[] rains) {
    	int n = rains.length;
    	int[] ans = new int[n];
    	//初始值设置
    	for (int i = 0; i < n; ++i) {
    		ans[i] = rains[i] == 0 ? -10 : -1;
    	}
    	Map<Integer, Integer> map = new HashMap<>();
    	int q = 0;
    	while (q < n) {
    		if (rains[q] == 0) {
    			++q;
    			continue;
    		} else {
    			if (map.containsKey(rains[q])) {
    				int lastQ = map.get(rains[q]);
    				boolean flag = true;
    				for (int i = lastQ + 1; i < q; ++i) {
    					//找得到排水日
    					if (ans[i] == -10) {
    						ans[i] = rains[q];
    						map.put(rains[q], q);
    						q++;
    						flag = false;
    						break;
    					}
    				}
    				if (flag) {
    					return new int[0];
    				}
    			} else {
    				map.put(rains[q], q);
    				++q;
    			}
    		}
    	}
    	for (int i = 0; i < n; ++i) {
    		if (ans[i] == -10) ans[i] = 1;
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
    	Week_194_3 p = new Week_194_3();
    	p.avoidFlood(new int[] {1,0,2,0,2,1});
	}
}
