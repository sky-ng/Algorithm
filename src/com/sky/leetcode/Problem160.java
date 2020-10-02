package com.sky.leetcode;

public class Problem160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        if (headA == headB) return headA;
    	ListNode pA = headA;
        ListNode pB = headB;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (pA != null && pB != null) {
        	pA = pA.next;
        	pB = pB.next;
        }
        while (pA != null) {
        	pA = pA.next;
        	tempA = tempA.next;
        }
        while (pB != null) {
        	pB = pB.next;
        	tempB = tempB.next;
        }
        pA = tempA;
        pB = tempB;
        while (pA != null) {
        	if (pA == pB) return pA;
        	pA = pA.next;
        	pB = pB.next;
        }
        return null;
    }
}
