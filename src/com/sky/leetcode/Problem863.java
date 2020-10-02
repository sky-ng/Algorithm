package com.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem863 {
	
	private List<Integer> ans;
	private int lastDire = -1;
	private int LEFT = 0;
	private int RIGHT = 1;
	private boolean flag = true;
	private int targetHeight;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
    	ans = new ArrayList<>();
    	//先向下找
    	dfs(target, K);
    	//再向上找
    	if (root != target) {
        	dfs(root, target, K, 0, LEFT);
    	}

		return ans;
    }
    
    private void dfs(TreeNode root, TreeNode target, int K, int height, int dire) {
    	if (root == null) return ;
    	if (root == target) {
    		flag = false;
    		targetHeight = height;
    		lastDire = dire;
    		return ;
    	}
    	dfs(root.left, target, K, height + 1, LEFT);
    	if (flag)
    		dfs(root.right, target, K, height + 1, RIGHT);
    	if (height < targetHeight && height >= (targetHeight - K)) {
    		if (height == (targetHeight - K)) {
    			ans.add(root.val);
    		} else {
        		if (lastDire == LEFT) {
        			dfs(root.right, K - 1 - (targetHeight - height));
        		} else if (lastDire == RIGHT) {
        			dfs(root.left, K - 1 - (targetHeight - height));
        		}
    		}
    		lastDire = dire;
    	}
	}

	private void dfs(TreeNode target, int K) {
    	if (target == null) return ;
    	if (K == 0) {
    		ans.add(target.val);
    		return;
    	}
    	dfs(target.left, K - 1);
    	dfs(target.right, K - 1);
    }
	
	public static void main(String[] args) {
		List<TreeNode> list = new ArrayList<>();
		for (int i = 0; i <= 5; i++) {
			TreeNode node = new TreeNode(i);
			list.add(node);
		}
		list.get(0).left = list.get(1);
		list.get(0).right = list.get(2);
		list.get(1).right = list.get(3);
		list.get(2).right = list.get(5);
		list.get(3).left = list.get(4);
		Problem863 p = new Problem863();
		List<Integer> ans = p.distanceK(list.get(0), list.get(3), 3);
		System.out.println(ans);
	}
}
