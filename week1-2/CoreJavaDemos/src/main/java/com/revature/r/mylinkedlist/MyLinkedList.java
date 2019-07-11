package com.revature.r.mylinkedlist;

public class MyLinkedList {
	private int length = 0;
	private LinkedListNode startNode;
	private LinkedListNode endNode;

	public int size() {
		return length;
	}

	public boolean remove(int index) {

		return false;
	}

	public void add(String element) {
		if (length == 0) {
			LinkedListNode newNode = new LinkedListNode(element, null, null);
			startNode = newNode;
			endNode = newNode;
		} else {
			LinkedListNode newNode = new LinkedListNode(element, null, endNode);
			endNode.nextNode = newNode;
			endNode = newNode;
		}
		length++;
	}

	public boolean add(int index, String element) {
		if (index < 0 || index >= length) {
			return false;
		}

		LinkedListNode currentNode = startNode;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.nextNode;
		}
//		currentNode
		LinkedListNode newNode = new LinkedListNode(element, currentNode, currentNode.prevNode);

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

	public String get(int index) {
		LinkedListNode currentNode = startNode;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.nextNode;
		}
		return currentNode.value;
	}

	public boolean set(int index, String value) {
		return false;
	}
}
