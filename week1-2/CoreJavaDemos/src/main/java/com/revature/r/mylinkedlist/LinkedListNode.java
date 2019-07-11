package com.revature.r.mylinkedlist;

class LinkedListNode {
	String value;
	LinkedListNode nextNode;
	LinkedListNode prevNode;
	public LinkedListNode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LinkedListNode(String value, LinkedListNode nextNode, LinkedListNode prevNode) {
		super();
		this.value = value;
		this.nextNode = nextNode;
		this.prevNode = prevNode;
	}
	
}
