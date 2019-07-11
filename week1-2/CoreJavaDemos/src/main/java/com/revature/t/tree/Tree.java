package com.revature.t.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import com.revature.s.stacks.MyStack;

public class Tree<T> {

	private MyTreeNode<T> rootNode;

	public boolean add(T parent, T child) {
		
		if (child == null) {
			return false;
		} else if (parent == null) { // case for adding root node
			MyTreeNode<T> newRootNode = new MyTreeNode<T>(child);
			if (rootNode != null) {
				newRootNode.children.add(rootNode);
			}
			rootNode = newRootNode;
			return true;
		} else {
			// adding a node as a child of another node
//			MyTreeNode<T> parentNode = findParentNodeDepthFirst(parent); // find the parent node
			MyTreeNode<T> parentNode = findNodeBreadthFirst(parent);
			if (parentNode != null) { // if parent node does exist
				parentNode.children.add(new MyTreeNode<T>(child)); // add child node
				return true;
			} else { // if parent node does not exist
				return false;
			}
		}
	}

	private MyTreeNode<T> findNodeBreadthFirst(T value) {
		System.out.println("finding element with value: " + value);
		Queue<MyTreeNode<T>> breadthQueue = new LinkedList<>();
		breadthQueue.add(rootNode);
		while (breadthQueue.size() != 0) {
			MyTreeNode<T> currentNode = breadthQueue.poll();
			System.out.println(currentNode.value);
			if (currentNode.value.equals(value)) {
				return currentNode;
			} else {
				breadthQueue.addAll(currentNode.children);
			}
		}

		return null;
	}

	private MyTreeNode<T> findParentNodeDepthFirst(T value) {
		System.out.println("finding element with value: " + value);
		if (rootNode != null && rootNode.value.equals(value)) {
			return rootNode;
		}
		MyStack<MyTreeNode<T>> depthStack = new MyStack<>();
		Set<MyTreeNode<T>> checkedNodes = new HashSet<>();
		System.out.println(rootNode.value);
		depthStack.push(rootNode);
		checkedNodes.add(rootNode);

		while (true) {
			MyTreeNode<T> currentNode = depthStack.peek();
			boolean allChildrenChecked = true;
			for (MyTreeNode<T> child : currentNode.children) {
				if (!checkedNodes.contains(child)) {
					if (child.value.equals(value)) {
						System.out.println(child.value);
						return child;
					} else {
						checkedNodes.add(child);
						depthStack.push(child);
						System.out.println(child.value);
						allChildrenChecked = false;
						break;
					}
				}
			}
			if (allChildrenChecked) {
				MyTreeNode<T> popped = depthStack.pop();
				if (popped == rootNode) {
					return null;
				}
			}
		}
	}

}
