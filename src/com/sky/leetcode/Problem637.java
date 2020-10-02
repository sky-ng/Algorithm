package com.sky.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
        	return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
        	int count = queue.size();
        	int num = count;
        	double sum = 0;
        	while (count > 0) {
        		count--;
        		TreeNode temp = queue.poll();
        		sum += temp.val;
        		if (temp.left != null) {
        			queue.add(temp.left);
        		}
        		if (temp.right != null) {
        			queue.add(temp.right);
        		}
        	}
        	result.add(sum / num);
        }
    	return result;
    }
}
