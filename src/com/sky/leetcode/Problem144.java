package com.sky.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Problem144 {
	
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> ans = new ArrayList<>();
    	TreeNode cur = root;
    	Deque<TreeNode> stack = new ArrayDeque<>();
    	while (cur != null || !stack.isEmpty()) {
    		while (cur != null) {
    			ans.add(cur.val);
    			stack.push(cur);
    			cur = cur.left;
    		}
    		TreeNode node = stack.poll();
    		cur = node.right;
    	}
        return ans;
    }
}
