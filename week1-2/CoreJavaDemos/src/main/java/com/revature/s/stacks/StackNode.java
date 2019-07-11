package com.revature.s.stacks;

public class StackNode<T> {
	T value;
	StackNode<T> nextNode;

	public StackNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackNode(T value, StackNode<T> nextNode) {
		super();
		this.value = value;
		this.nextNode = nextNode;
	}

}
