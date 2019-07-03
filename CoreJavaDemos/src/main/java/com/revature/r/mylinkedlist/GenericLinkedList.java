package com.revature.r.mylinkedlist;

public class GenericLinkedList<T> {
	private int length = 0;
	private GenericLinkedListNode<T> startNode;
	private GenericLinkedListNode<T> endNode;

	public int size() {
		return length;
	}

	public boolean remove(int index) {

		return false;
	}

	public void add(T element) {
		if (length == 0) {
			GenericLinkedListNode<T> newNode = new GenericLinkedListNode<>(element, null, null);
			startNode = newNode;
			endNode = newNode;
		} else {
			GenericLinkedListNode<T> newNode = new GenericLinkedListNode<>(element, null, endNode);
			endNode.nextNode = newNode;
			endNode = newNode;
		}
		length++;
	}

	public boolean add(int index, T element) {
		if (index < 0 || index >= length) {
			return false;
		}

		GenericLinkedListNode<T> currentNode = startNode;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.nextNode;
		}
//		currentNode
		GenericLinkedListNode<T> newNode = new GenericLinkedListNode<>(element, currentNode, currentNode.prevNode);

		if (index == 0) {
			startNode = newNode;

		} else {
			if (index == length - 1) {
				endNode = newNode;
			}
			currentNode.prevNode.nextNode = newNode;
		}
		currentNode.prevNode = newNode;
		length++;
		return true;
	}

	public T get(int index) {
		GenericLinkedListNode<T> currentNode = startNode;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.nextNode;
		}
		return currentNode.value;
	}

	public boolean set(int index, T value) {
		return false;
	}
}
