package com.tilak.leetcode;

// This class will be used to create Linked List
public class LinkList {
	
	Node head;
	
	class Node {
		
		int data;
		Node next;
		
		Node (int data){
			this.data = data;
			next = null;
		}
	}
	public void add(int value) {
		if (head == null ) {
			this.head = new Node(value);
		}else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node (value);
		}
	}
	
	public void print () {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data+ "->");
			temp = temp.next;
		}
		if (temp == null) {
			System.out.print("null");
		}
		
	}
	
	public int size() {
		Node temp = this.head;
		int count =0;
		while (temp != null) {
			
			temp = temp.next;
			count++;
		}
		return count;
		
	}
	
}



