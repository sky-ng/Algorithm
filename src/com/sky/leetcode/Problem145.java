package com.sky.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Problem145 {
	
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> ans = new LinkedList<>();
    	TreeNode cur = root;
    	Deque<TreeNode> stack = new LinkedList<>();
    	TreeNode pre = null;
        while (cur != null || !stack.isEmpty()) {
        	while (cur != null) {
        		stack.push(cur);
        		cur = cur.left;
        	}
        	cur = stack.pop();
        	if (cur.right == null || cur.right == pre) {
        		ans.add(cur.val);
        		pre = cur;
        		cur = null;
        	} else {
        		stack.push(cur);
        		cur = cur.right;
        	}
        }
        return ans;
    }
}
