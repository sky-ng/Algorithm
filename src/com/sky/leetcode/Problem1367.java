package com.sky.leetcode;

public class Problem1367 {
    public boolean isSubPath(ListNode head, TreeNode root) {
    	if (root == null) return false;
    	return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    
    private boolean dfs(ListNode head, TreeNode root) {
    	if (head == null) return true;
    	if (root == null) return false;
    	if (root.val != head.val) return false;
    	return dfs(head.next, root.left) || dfs(head.next, root.right);
    }
}
