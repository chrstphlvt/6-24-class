package com.revature.r.mylinkedlist;

class GenericLinkedListNode<T> {
	T value;
	GenericLinkedListNode<T> nextNode;
	GenericLinkedListNode<T> prevNode;

	public GenericLinkedListNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenericLinkedListNode(T value, GenericLinkedListNode<T> nextNode, GenericLinkedListNode<T> prevNode) {
		super();
		this.value = value;
		this.nextNode = nextNode;
		this.prevNode = prevNode;
	}

}
