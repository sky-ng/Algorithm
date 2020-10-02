package com.sky.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Problem103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
        	return new ArrayList<>();
        }
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean flag = true;
        deque.addFirst(root);
        while (!deque.isEmpty()) {
        	int size = deque.size();
        	List<Integer> list = new ArrayList<>();
        	while (size-- > 0) {
        		if (flag) {
        			TreeNode cur = deque.pollFirst();
        			list.add(cur.val);
        			if (cur.left != null) {
        				deque.addLast(cur.left);
        			}
        			if (cur.right != null) {
        				deque.addLast(cur.right);
        			}
        		} else {
        			TreeNode cur = deque.pollLast();
        			list.add(cur.val);
        			if (cur.right != null) {
        				deque.addFirst(cur.right);
        			}
        			if (cur.left != null) {
        				deque.addFirst(cur.left);
        			}
        		}
        	}
        	flag = !flag;
        	res.add(list);
        }
        return res;
    }
}
