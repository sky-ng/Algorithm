package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem95 {
    public List<TreeNode> generateTrees(int n) {
    	if (n <= 0) {
    		return new ArrayList<>();
    	}
    	List<TreeNode> res = helper(1, n);
    	return res;
    }
    
    private List<TreeNode> helper(int start, int end) {
    	List<TreeNode> list = new ArrayList<>();
    	if (start > end) {
    		list.add(null);
    		return list;
    	}
    	for (int i = start; i<= end; i++) {
    		List<TreeNode> left_tree = helper(start, i - 1);
    		List<TreeNode> right_tree = helper(i + 1, end);
    		for (TreeNode l : left_tree) {
    			for (TreeNode r : right_tree) {
    				TreeNode cur = new TreeNode(i);
    				cur.left = l;
    				cur.right = r;
    				list.add(cur);
    			}
    		}
    	}
    	return list;
    }
}
