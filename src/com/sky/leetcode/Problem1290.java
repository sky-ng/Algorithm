package com.sky.leetcode;

public class Problem1290 {
    public int getDecimalValue(ListNode head) {
    	int ans = 0;
    	ListNode cur = head;
    	while (cur != null) {
    		ans = ans << 1;
    		ans += cur.val;
    		cur = cur.next;
    	}
    	return ans;
    }
}
