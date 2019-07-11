package com.revature.s.stacks;

public class MyStack<T> {
	private int length;
	private StackNode<T> topNode;

	/**
	 * Get the number of elements in the stack
	 * 
	 * @return
	 */
	public int size() {
		return length;
	}

	/**
	 * Remove the top element from the stack and return that element
	 * 
	 * @return the top element
	 */
	public T pop() {
		if (length >= 1) {
			StackNode<T> oldTop = topNode;
			topNode = oldTop.nextNode;
			length--;
			return oldTop.value;
		} else {
			return null;
		}
	}

	/**
	 * Add a new element to the to of the stack
	 * 
	 * @param element
	 */
	public void push(T element) {
		StackNode<T> newNode = new StackNode<>(element, topNode);
		topNode = newNode;
		length++;
	}

	/**
	 * Peek will return the top element without removing it from the stack
	 * 
	 * @return the top element
	 */
	public T peek() {
		if (topNode != null) {
			return topNode.value;
		} else {
			return null;
		}

	}

	@Override
	public String toString() {
		String output = "";

		StackNode<T> currentNode = topNode;
		for (int i = 0; i < length; i++) {
			output += currentNode.value.toString() + "\n";
			currentNode = currentNode.nextNode;
		}

		return output;
	}
}
