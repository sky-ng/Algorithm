package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem437 {
	
	private int ans = 0;
	
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        helper(root, new ArrayList<>(), sum);
        return ans;
    }
    
    private void helper(TreeNode node, List<Integer> list, int sum) {
    	List<Integer> newList = new ArrayList<>();
    	int num = node.val;
    	newList.add(num);
    	if (num == sum) ++ans;
    	for (int n : list) {
    		num = node.val + n;
    		newList.add(num);
    		if (num == sum) ++ans;
    	}
    	if (node.left != null) helper(node.left, newList, sum);
    	if (node.right != null) helper(node.right, newList, sum);
    }
}
