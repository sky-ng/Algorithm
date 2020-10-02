package com.sky.leetcode;

public class Problem707 {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addAtHead(7);
		list.traverse();
		list.addAtHead(2);
		list.traverse();
		list.addAtHead(1);
		list.traverse();
		list.addAtIndex(3, 0);
		list.traverse();
		list.deleteAtIndex(2);
		list.traverse();
		list.addAtHead(6);
		list.traverse();
		list.addAtTail(4);
		list.traverse();
		System.out.println("get得到的值为" + list.get(4));
		list.addAtHead(4);
		list.traverse();
		list.addAtIndex(5, 0);
		list.traverse();
		list.addAtHead(6);
		list.traverse();
	}
}

class MyLinkedList {
	
	private ListNode head;
	private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
    	head = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode current = head;
        int cnt = 0;
        while (cnt < index) {
        	current = current.next;
        	cnt++;
        }
        return current.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	addAtIndex(0, val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	addAtIndex(size, val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	if (index > size) return;
        ListNode addNode = new ListNode(val);
        if (index <= 0) {
        	addNode.next = head;
        	head = addNode;
        } else {
        	int count = 1;
        	ListNode cur = head;
        	while (count < index) {
        		count++;
        		cur = cur.next;
        	}
        	addNode.next = cur.next;
        	cur.next = addNode;
        }
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
        	head = head.next;
        } else {
        	int count = 1;
        	ListNode cur = head;
        	while (count < index) {
        		count++;
        		cur = cur.next;
        	}
        	cur.next = cur.next.next;
        }
        size--;
    }
    
    public void traverse() {
    	ListNode cur = head;
    	for (int i = 0; i < size; i++) {
    		System.out.print(cur.val + " ");
    		cur = cur.next;
    	}
    	System.out.println();
    }
}