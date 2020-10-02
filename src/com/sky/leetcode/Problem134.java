package com.sky.leetcode;

public class Problem134 {
	//0   1   2   3   4  index
	//1   2   3   4   5  gas
	//3   4   5   1   2  cost
	//-2 -4  -6  -3   0  
	//            3   6
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int gas_sum = 0, cost_sum = 0;
    	int len = gas.length;
    	for (int i = 0; i < len; i++) {
    		gas_sum += gas[i];
    	}
    	for (int i = 0; i < len; i++) {
    		cost_sum += cost[i];
    	}
    	if (gas_sum < cost_sum) {
    		return -1;
    	}
    	int res = -1;
    	int cur = 0;
    	boolean flag = false;
    	for (int i = 0; i < len; i++) {
    		if (gas[i] >= cost[i] && !flag) {
    			flag = true;
    			res = i;
    			cur = 0;
    		}
    		if (flag) {
    			cur += (gas[i] - cost[i]);
    			if (cur < 0) {
    				flag = false;
    			}
    		}
    	}
    	return res;
    }
	//0   1   2   3   4  
	//1   2   3   4   5  6
	//3   4   5   1   9  
	//-2 -4  -6  -3  -1  0
    //            3  -1  6
    public static void main(String[] args) {
		
	}
}
