package com.sky.offer;

import java.util.Stack;

public class Problem36 {
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        Node p = root, preP = null;
        Node res = null;
        Stack<Node> stack = new Stack<>();
        boolean init = true;
        while (p != null || !stack.empty()) {
//        	System.out.println("start");
        	while (p != null) {
//        		System.out.println("1:" + p.val);
        		stack.push(p);
            	p = p.left;
        	}
        	if (init) {
        		res = stack.pop();
        		init = false;
        		preP = res;
        		p = res.right;
        		continue;
        	}
        	p = stack.pop();
//        	System.out.println("2:" + p.val);
        	preP.right = p;
        	p.left = preP;
        	preP = p;
        	p = p.right;
        }
        preP.right = res;
        res.left = preP;
        return res;
    }
}
