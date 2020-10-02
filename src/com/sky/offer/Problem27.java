package com.sky.offer;

public class Problem27 {
    public TreeNode mirrorTree(TreeNode root) {
    	if (root == null) return null;
    	
    	TreeNode t = root.left;
    	root.left = root.right;
    	root.right = t;
    	
    	mirrorTree(root.left);
    	mirrorTree(root.right);
    	
    	return root;
    }
    
    public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		Problem27 p = new Problem27();
		TreeNode r = p.mirrorTree(t1);
		System.out.println(r.val);
		System.out.println(r.left.val);
		System.out.println(r.right.val);
		System.out.println(r.left.left.val);
		System.out.println(r.left.right.val);
		System.out.println(r.right.left.val);
		System.out.println(r.right.right.val);
	}
}
