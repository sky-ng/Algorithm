package com.sky.leetcode;

public class Problem108 {
    public TreeNode sortedArrayToBST(int[] nums) {
    	return findRootNode(nums, 0, nums.length - 1);
    }
    
    private TreeNode findRootNode(int[] nums, int l, int r) {
    	if (l > r) return null;
    	int mid = (l + ((r - l) >> 1));
    	TreeNode root = new TreeNode(nums[mid]);
    	root.left = findRootNode(nums, l, mid - 1);
    	root.right = findRootNode(nums, mid + 1, r);
    	return root;
    }
    
    public static void main(String[] args) {
    	Problem108 p = new Problem108();
    	p.sortedArrayToBST(new int[] {0, 1});
	}
}
