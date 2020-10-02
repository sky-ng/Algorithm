package com.sky.contest;

import java.util.Stack;

public class Week_192_3 {
	public static void main(String[] args) {
		BrowserHistory b = new BrowserHistory("esgriv.com");
		b.visit("cgrt.com");
		b.visit("tip.com");
		b.back(9);
		b.visit("kttzxgh.com");
		b.forward(7);
		b.visit("creje.com");
		b.visit("iybch.com");
		b.forward(5);
		b.visit("uun.com");
		b.back(10);
		b.visit("hci.com");
		b.visit("whula.com");
		b.forward(10);
	}
}

class BrowserHistory {
	
	private Stack<String> stackA;
	private Stack<String> stackB;
	
    public BrowserHistory(String homepage) {
    	stackA = new Stack<>();
    	stackB = new Stack<>();
    	stackA.push(homepage);
    }
    
    public void visit(String url) {
    	stackA.push(url);
    	stackB.clear();
    }
    
    public String back(int steps) {
    	while (!stackA.empty() && steps > 0) {
    		steps--;
    		stackB.push(stackA.pop());
    	}
    	if (stackA.empty()) {
    		stackA.push(stackB.pop());
    	}
    	return stackA.peek();
    }
    
    public String forward(int steps) {
    	while (!stackB.empty() && steps > 0) {
    		steps--;
    		stackA.push(stackB.pop());
    	}
    	return stackA.peek();
    }
}
